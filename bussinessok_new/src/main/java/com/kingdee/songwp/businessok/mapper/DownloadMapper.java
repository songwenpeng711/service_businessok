package com.kingdee.songwp.businessok.mapper;

import java.util.List;

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

/**
 * 下载数据查询接口
 * 
 * @author songwenpeng 20180906
 *
 */
public interface DownloadMapper {

	/**
	 * 获取部门信息
	 * 
	 * @param userID 用户ID
	 * @return
	 */
	List<Department> getDepartments(int userID);

	/**
	 * 获取职员信息
	 * 
	 * @param userID 用户ID
	 * @return
	 */
	List<Employee> getEmployees(int userID);

	/**
	 * 获取商品信息
	 * 
	 * @param userID 用户ID
	 * @return
	 */
	List<Goods> getGoods(int userID);

	/**
	 * 获取计量单位信息
	 * 
	 * @param userID 用户ID
	 * @return
	 */
	List<MeasureUnit> getUnits();

	/**
	 * 获取客户信息
	 * 
	 * @param userID 客户ID
	 * @return
	 */
	List<Organization> getOrganizations(int userID);

	/**
	 * 获取价格政策信息
	 * 
	 * @return
	 */
	List<PricePly> getPricePlys();
	
	

	/**
	 * 获取销售政策信息
	 * 
	 * @return
	 */
	List<SalePly> getSalePlys();
	
	List<SalePolicy> getSalePolicys();

	/**
	 * 获取仓库信息
	 * 
	 * @return
	 */
	List<Stock> getStocks(int userID);
	/**
	 * 获取页面参数
	 * @param fNumber
	 * @return
	 */
	List<UIParameter> getUIParameter(String fNumber);
	/**
	  *  获取销售订单参数
	 * @return
	 */
	List<SaleOrderParameter> getSaleOrderParameter(String fNumber);
	/**
	 * 获取出库单参数
	 * @param fNumber
	 * @return
	 */
	List<StockBillParameter> getStockBillParameter(String fNumber);
	/**
	 * 获取领料单参数
	 * @param fNumber
	 * @return
	 */
	List<PickingMaterialParameter> getPickingMaterialParameter(String fNumber);
	/**
	 * 订单统计信息
	 * @param startDate 起始日期
	 * @param endDate 结束日期
	 * @param empID 员工ID
	 * @return
	 */
	List<SaleOrderStatic> getSaleOrderStatic(String startDate, String endDate, int empID);
	/**
	   * 订单商品统计信息
	 * @param startDate 起始日期
	 * @param endDate 结束日期
	 * @param empID 员工ID
	 * @param orgIDList 客户ID列表
	 * @return
	 */
	List<SOrderGoodStatic> getSOrderGoodStatic(String startDate, String endDate, int empID, List<Long> orgIDList);
	/**
	   *   获取库存信息
	 * @param fItemIDs
	 * @param stockIDs
	 * @return
	 */
	List<Inventory> getInventories(List<Long> fItemIDs, List<Long> stockIDs);

}
