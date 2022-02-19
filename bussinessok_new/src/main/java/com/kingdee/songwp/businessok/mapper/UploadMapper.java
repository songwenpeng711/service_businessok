package com.kingdee.songwp.businessok.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.kingdee.songwp.businessok.bean.StockBill;
import com.kingdee.songwp.businessok.bean.StockBillEntry;
import com.kingdee.songwp.businessok.bean.Organization;
import com.kingdee.songwp.businessok.bean.SaleOrder;
import com.kingdee.songwp.businessok.bean.SaleOrderEntry;

public interface UploadMapper {
	
	/**
	   *  获取单据编号 
	 * @param paramMap （fBillType-单据类型 billID-返回单据编号）
	 */
	void getBillID(Map paramMap);
	/**
	   * 获取单据最大内码
	 * @param paramMap （tableName-表名称  userID-用户ID fInterID-返回内码）
	 */
	void getICMaxNum(Map paramMap);
	/**
	 * 更新库存方式
	 * @return
	 */
	Integer getUpStockWhenSave();
	/**
	    * 插入销售订单数据
	 * @param saleOrder 
	 * @return
	 */
	int insertSaleOrder(SaleOrder saleOrder);
	/**
	 * 插入销售订单实体数据
	 * @param entryList
	 * @return
	 */
	int insertSaleOrderEntry(@Param("entryList") List<SaleOrderEntry> entryList);
	/**
	    * 插入出库单数据
	 * @param stockBill
	 * @return
	 */
	int insertStockBill(StockBill stockBill);
	/**
	   * 插入出库单实体数据
	 * @param entryList
	 * @return
	 */
	int insertStockBillEntry(@Param("entryList") List<StockBillEntry> entryList);
	/**
	   *  更新客户信息
	 * @param org
	 * @return
	 */
	int updateOrganization(Organization org);
	/**
	 * 更新客户信息辅表（客户名称）
	 * @param org
	 * @return
	 */
	int updateOrgItem(Organization org);
	/**
	   *   更新库存数量
	 * @param entry
	 * @return
	 */
	int updateInventory(StockBillEntry entry);
	/**
	    *      辅助单位换算率
	 * @param fItemID
	 * @return
	 */
	Float getFSecCoefficient(Long fItemID);
}
