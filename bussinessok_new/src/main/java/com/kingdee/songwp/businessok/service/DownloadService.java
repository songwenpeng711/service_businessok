package com.kingdee.songwp.businessok.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingdee.songwp.businessok.bean.Department;
import com.kingdee.songwp.businessok.bean.Employee;
import com.kingdee.songwp.businessok.bean.Goods;
import com.kingdee.songwp.businessok.bean.Inventory;
import com.kingdee.songwp.businessok.bean.MeasureUnit;
import com.kingdee.songwp.businessok.bean.Organization;
import com.kingdee.songwp.businessok.bean.PickingMaterialParameter;
import com.kingdee.songwp.businessok.bean.PricePly;
import com.kingdee.songwp.businessok.bean.SOrderGoodStatic;
import com.kingdee.songwp.businessok.bean.SaleOrderParameter;
import com.kingdee.songwp.businessok.bean.SaleOrderStatic;
import com.kingdee.songwp.businessok.bean.SalePly;
import com.kingdee.songwp.businessok.bean.SalePolicy;
import com.kingdee.songwp.businessok.bean.Stock;
import com.kingdee.songwp.businessok.bean.StockBillParameter;
import com.kingdee.songwp.businessok.bean.UIParameter;
import com.kingdee.songwp.businessok.mapper.DownloadMapper;

@Service("downloadService")
public class DownloadService {
	
	@Autowired
	private DownloadMapper downloadMapper;
	
	public List<Employee> getEmployees(int userID) {
		
		return downloadMapper.getEmployees(userID);
		
	}
	
	public List<Department> getDepartments(int userID) {
		
		return downloadMapper.getDepartments(userID);
	}
	
	public List<Organization> getOrganizations(int userID) {
		
		return downloadMapper.getOrganizations(userID);
		
	}
	
	public List<Goods> getGoods(int userID) {
		
		return downloadMapper.getGoods(userID);
	}
	
	public List<Stock> getSockets(int userID) {
		
		return downloadMapper.getStocks(userID);
	}
	
	public List<MeasureUnit> getUnits() {
		
		return downloadMapper.getUnits();
	}
	
	public List<PricePly> getPricePlys() {
		
		return downloadMapper.getPricePlys();
	}
	
	public List<SalePly> getSalePlys() {
		
		return downloadMapper.getSalePlys();
	}
	
	public List<SalePolicy> getSalePolicys() {
		
		return downloadMapper.getSalePolicys();
	}
	
	public UIParameter getUIParameter(String fNumber) {
		List<UIParameter> pList = downloadMapper.getUIParameter(fNumber);
		if(pList != null && pList.size() > 0) {
			return pList.get(0);
		}
		return null;
	}	
	
	public SaleOrderParameter getSaleOrderParameter(String fNumber) {
		List<SaleOrderParameter> pList = downloadMapper.getSaleOrderParameter(fNumber);
		if(pList != null && pList.size() > 0) {
			return pList.get(0);
		}
		return null;
	} 
	
	
	public StockBillParameter getStockBillParameter(String fNumber) {
		List<StockBillParameter> pList = downloadMapper.getStockBillParameter(fNumber);
		if(pList != null && pList.size() > 0) {
			return pList.get(0);
		}
		return null;
	}
	
	public PickingMaterialParameter getPickingMaterialParameter(String fNumber) {
		List<PickingMaterialParameter> pList = downloadMapper.getPickingMaterialParameter(fNumber);
		if(pList != null && pList.size() > 0) {
			return pList.get(0);
		}
		return null;
	}
	
	public List<SaleOrderStatic> getSaleOrderStatic(String startDate, String endDate, int empID) {
		List<SaleOrderStatic> staticList = downloadMapper.getSaleOrderStatic(startDate, endDate, empID);
		
		return staticList;
	}
	
	public List<SaleOrderStatic> getSOrderGoodStatic(String startDate, String endDate, int empID) {
		//订单客户统计
		List<SaleOrderStatic> staticList = downloadMapper.getSaleOrderStatic(startDate, endDate, empID);
		if(staticList == null || staticList.size() == 0) {
			return staticList;
		}
		//订单客户商品统计
		List<Long> orgIDList = new ArrayList<Long>();
		for (SaleOrderStatic statis : staticList) {
			orgIDList.add(statis.getOrgID());
		}
		List<SOrderGoodStatic> gStaticList = downloadMapper.getSOrderGoodStatic(startDate, endDate, empID, orgIDList);
		//订单合成统计
		for(SaleOrderStatic statis : staticList) {
			for(SOrderGoodStatic gStatic : gStaticList) {
				if(statis.getOrgID().equals(gStatic.getOrgID())) {
					statis.getGoodsAmount().add(gStatic);
				}		}
		}
		return staticList;
	}
	
	/**
	   * 库存信息
	 * 
	 * @return
	 */
	public List<Inventory> getInventories(List<Long> fItemIDs, List<Long> stockIDs) {
		return downloadMapper.getInventories(fItemIDs, stockIDs);
	}
	

}
