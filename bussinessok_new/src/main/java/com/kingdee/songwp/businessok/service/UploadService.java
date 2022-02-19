package com.kingdee.songwp.businessok.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kingdee.songwp.businessok.bean.Organization;
import com.kingdee.songwp.businessok.bean.SaleOrder;
import com.kingdee.songwp.businessok.bean.SaleOrderEntry;
import com.kingdee.songwp.businessok.bean.StockBill;
import com.kingdee.songwp.businessok.bean.StockBillEntry;
import com.kingdee.songwp.businessok.mapper.UploadMapper;

@Service("uploadService")
public class UploadService {
	
	@Autowired
	private UploadMapper uploadMapper;

	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.REPEATABLE_READ,
			rollbackFor={RuntimeException.class, Exception.class})
	public synchronized void  uploadSaleOrder(SaleOrder saleOrder) {
	    
		long userID = saleOrder.getfBillerID();
		List<SaleOrderEntry> entryList = saleOrder.getSaleOrderEntryList();
		//获取订单编号
		Map<String,Object> paraMap = new HashMap<String, Object>();
		paraMap.put("fBillType", 81);
		paraMap.put("billID", "");
		uploadMapper.getBillID(paraMap);
		String fBillNo = (String)paraMap.get("billID");
		//获取订单内码
 		paraMap.clear();
		paraMap.put("tableName", "SEOrder");
		paraMap.put("userID", userID);
		paraMap.put("fInterID", null);
		uploadMapper.getICMaxNum(paraMap);
		Integer fInterID = (Integer)paraMap.get("fInterID");
		
		//插入订单数据
		saleOrder.setfBillNo(fBillNo);
		saleOrder.setfInterID(fInterID);
		uploadMapper.insertSaleOrder(saleOrder);

		for(int i = 0; i < entryList.size(); i++) {
			//获取辅助单位换算率
			SaleOrderEntry entry = entryList.get(i);
			Float fSecCoefficient = uploadMapper.getFSecCoefficient(entry.getfItemID());
			if(fSecCoefficient == null) {
				fSecCoefficient = 0F;
			}			
			entry.setfSecCoefficient(fSecCoefficient);
			if(fSecCoefficient == 0) {
				entry.setfSecQty(0F);
			} else {
				Float qty = entry.getfQty();
				entry.setfSecQty(qty / fSecCoefficient);
			}
			entry.setfInterID(fInterID);
			entry.setfEntryID(i+1);
		}
		uploadMapper.insertSaleOrderEntry(entryList);
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.REPEATABLE_READ,
			rollbackFor={RuntimeException.class, Exception.class})
	public synchronized  void uploadStockBill(StockBill stockBill) {

		long userID = stockBill.getfBillerID();
		List<StockBillEntry> entryList = stockBill.getStockBillEntryList();
		//获取订单编号
		Map<String,Object> paraMap = new HashMap<String, Object>();
		paraMap.put("fBillType", 21);
		paraMap.put("billID", "");
		uploadMapper.getBillID(paraMap);
		String fBillNo = (String)paraMap.get("billID");
		//获取订单内码
 		paraMap.clear();
		paraMap.put("tableName", "ICStockBill");
		paraMap.put("userID", userID);
		paraMap.put("fInterID", null);
		uploadMapper.getICMaxNum(paraMap);
		Integer fInterID = (Integer)paraMap.get("fInterID");
		//库存更新标识
		Integer fUpStockWhenSave = uploadMapper.getUpStockWhenSave();
		//更新库存
        for(StockBillEntry entry : entryList) {
        	uploadMapper.updateInventory(entry);
        }
		//插入订单数据
		stockBill.setfBillNo(fBillNo);
		stockBill.setfInterID(fInterID);
		stockBill.setfUpStockWhenSave(fUpStockWhenSave);
		uploadMapper.insertStockBill(stockBill);
		
		for(int i = 0; i < entryList.size(); i++) {
			StockBillEntry entry = entryList.get(i);
			Float fSecCoefficient = uploadMapper.getFSecCoefficient(new Long(entry.getfItemID()));
			if(fSecCoefficient == null) {
				fSecCoefficient = 0F;
			}
			entry.setfSecCoefficient(fSecCoefficient);
			if(fSecCoefficient == 0) {
				entry.setfSecQty(0F);
			} else {
				Float qty = entry.getfQty();
				entry.setfSecQty(qty / fSecCoefficient);
			}			
			entry.setfInterID(fInterID);
			entry.setfEntryID(i+1);
		}
		uploadMapper.insertStockBillEntry(entryList);
	
	}
	/**
	    * 更新客户信息
	 * @param org
	 * @param changedName 是否更改用户名称
	 * @return
	 */
	public int updateOrganization(Organization org) {
		int result = 0;
		result = uploadMapper.updateOrganization(org);
		result = uploadMapper.updateOrgItem(org);
		return result;
		
	}
	
}
