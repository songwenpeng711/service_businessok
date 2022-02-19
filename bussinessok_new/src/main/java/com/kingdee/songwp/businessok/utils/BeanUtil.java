package com.kingdee.songwp.businessok.utils;

import java.util.ArrayList;
import java.util.List;

import com.kingdee.songwp.businessok.bean.SaleOrder;
import com.kingdee.songwp.businessok.bean.SaleOrderEntry;
import com.kingdee.songwp.businessok.bean.StockBill;
import com.kingdee.songwp.businessok.bean.StockBillEntry;

public class BeanUtil {
	
	public static StockBill changeToStockBill(SaleOrder saleOrder, int valueType) {
		StockBill stockBill = new StockBill();
		//销售方式
		stockBill.setfSaleStyle(saleOrder.getfSaleStyle());
		//销售业务类型
		stockBill.setfMarketingStyle(saleOrder.getfBizTyp());
		//客户ID
		stockBill.setfSupplyID((int)saleOrder.getfCustID());
		//单据日期
		stockBill.setfDate(saleOrder.getfDate());
		//手机订单号
		stockBill.setfFHtPhoneNo(saleOrder.getfFHtPhoneNo());
		//打印次数
		stockBill.setfPrintCount(saleOrder.getfPrintCount());
		//仓库ID
		stockBill.setfDCStockID(saleOrder.getfStockID().intValue());
		//部门ID
		stockBill.setfDeptID((int)saleOrder.getfDeptID());
		//员工ID
		stockBill.setfEmpID((int)saleOrder.getfEmpID());
		//制单人ID
		stockBill.setfBillerID((int)saleOrder.getfBillerID());
	    //摘要
		stockBill.setfExplanation(saleOrder.getfExplanation());
		//单据实体
	    List<StockBillEntry> entryList = new ArrayList<StockBillEntry>();
	    for(SaleOrderEntry entry : saleOrder.getSaleOrderEntryList()) {
	    	StockBillEntry sEntry = changeToStockBillEntry(entry, valueType);
	    	entryList.add(sEntry);
	    }
	    stockBill.setStockBillEntryList(entryList);
		return stockBill;
	}
	
	public static StockBillEntry changeToStockBillEntry(SaleOrderEntry soEntry,  int valueType) {
		StockBillEntry sbEntry = new StockBillEntry();
		//单据ID
		sbEntry.setfInterID(soEntry.getfInterID());
		//物料编码
		sbEntry.setfItemID((int)soEntry.getfItemID());
		//条形码
		sbEntry.setfBarCode(soEntry.getfBarCode());
		//仓库ID
		sbEntry.setfDCStockID(soEntry.getfStockID().intValue());
		//计量单位ID
		sbEntry.setfUnitID(soEntry.getfUnitID());
		//数量
		sbEntry.setfAuxQty(soEntry.getfAuxQty() * valueType);
		//基本单位数量
		sbEntry.setfQty(soEntry.getfQty() * valueType);
		//单价
		sbEntry.setfAuxPrice(soEntry.getfAuxPrice());
		//金额
		sbEntry.setfAmount(soEntry.getfAmount() * valueType);
		//批次号
		if(soEntry.getfBatchNo() != null) {
			sbEntry.setfBatchNo(soEntry.getfBatchNo());
		} else {
			sbEntry.setfBatchNo("");
		}
		//生产采购日期
		sbEntry.setfKFDate(soEntry.getfKFDate());
		//保质期
		sbEntry.setfKFPeroid(soEntry.getfKFPeroid());
		//有效期止
		sbEntry.setfPeriodDate(soEntry.getfPeriodDate());
		//备注
		sbEntry.setfNote(soEntry.getNote());
		return sbEntry;
	}

}
