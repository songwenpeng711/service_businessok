package com.kingdee.songwp.businessok.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.songwp.businessok.aspect.EncryptAspect;
import com.kingdee.songwp.businessok.bean.Department;
import com.kingdee.songwp.businessok.bean.Employee;
import com.kingdee.songwp.businessok.bean.Goods;
import com.kingdee.songwp.businessok.bean.Inventory;
import com.kingdee.songwp.businessok.bean.MeasureUnit;
import com.kingdee.songwp.businessok.bean.Organization;
import com.kingdee.songwp.businessok.bean.PickingMaterialParameter;
import com.kingdee.songwp.businessok.bean.PricePly;
import com.kingdee.songwp.businessok.bean.SaleOrder;
import com.kingdee.songwp.businessok.bean.SaleOrderParameter;
import com.kingdee.songwp.businessok.bean.SaleOrderStatic;
import com.kingdee.songwp.businessok.bean.SalePolicy;
import com.kingdee.songwp.businessok.bean.Stock;
import com.kingdee.songwp.businessok.bean.StockBill;
import com.kingdee.songwp.businessok.bean.StockBillEntry;
import com.kingdee.songwp.businessok.bean.StockBillParameter;
import com.kingdee.songwp.businessok.bean.UIParameter;
import com.kingdee.songwp.businessok.service.DownloadService;
import com.kingdee.songwp.businessok.service.LoadingService;
import com.kingdee.songwp.businessok.service.UploadService;
import com.kingdee.songwp.businessok.utils.BeanUtil;
import com.kingdee.songwp.businessok.utils.ErrorInfo;

@Controller
public class MainController {
	
	private static final Logger logger = LogManager.getLogger(MainController.class);
	
	public static final int BUZZINESS_TYPE_SALE_ORDER = 0;
    public static final int BUZZINESS_TYPE_STOCK_OUT = 1;
    public static final int BUZZINESS_TYPE_STOCK_RETURN = 3;
    public static final int BUZZINESS_TYPE_PICKING_MATERIAL = 5;

	@Autowired
	private DownloadService downloadService;

	@Autowired
	private LoadingService loadingService;
	
	@Autowired
	private UploadService uploadService;

	@ResponseBody
	@RequestMapping(value = "/web/download", method = RequestMethod.POST)
	public String download(@RequestParam(value = "requestStr") String reqStr) {

		// 解析Json
		JSONObject jsonObject = JSONObject.parseObject(reqStr);
		logger.info("request str : \b\n" + jsonObject);
		String userIdStr = jsonObject.getString("FUserID");
		String fNumber = jsonObject.getString("FNumber");
		int fUserID = -1;
		if(!StringUtils.isEmpty(userIdStr)) {
			fUserID = Integer.valueOf(userIdStr);
		}
		
		String tableName = jsonObject.getString("BTName");
		String fItemIDStr = jsonObject.getString("FItemID");
		String stockIDStr = jsonObject.getString("StockID");
		List<Long> fItemIDs = jsonObject.getObject("FItemIDs", List.class);
		List<Long> stockIDs = jsonObject.getObject("stockIDs", List.class);
		String resp = null;
		//判断用户是否禁用
		Integer isForbidden = loadingService.isForbidden(fUserID);
		if(isForbidden != null && isForbidden == 1) {
			String errJsonStr = ErrorInfo.getErrJsonStr(ErrorInfo.FORBIDDEN_USER_ERROR);
			jsonObject.put("Content", errJsonStr);
			jsonObject.put("Result", "error");
			logger.info(errJsonStr);
			return jsonObject.toJSONString();
		}
		// 获取数据值
		switch (tableName) {
		case "t_Organization":
			List<Organization> orgList = downloadService.getOrganizations(fUserID);
			resp = JSONObject.toJSONString(orgList);
			break;
		case "t_Department":
			List<Department> departmentList = downloadService.getDepartments(fUserID);
			resp = JSONObject.toJSONString(departmentList);
			break;
		case "t_ICItem":
			List<Goods> goodsList = downloadService.getGoods(fUserID);
			resp = JSONObject.toJSONString(goodsList);
			break;
		case "t_Stock":
			List<Stock> stockList = downloadService.getSockets(fUserID);
			resp = JSONObject.toJSONString(stockList);
			break;
		case "t_MeasureUnit":
			List<MeasureUnit> unitList = downloadService.getUnits();
			resp = JSONObject.toJSONString(unitList);
			break;
		case "ICPrcPly":
			List<PricePly> pricePlyList = downloadService.getPricePlys();
			resp = JSONObject.toJSONString(pricePlyList);
			break;
		case "t_Base_Emp":
			List<Employee> employeeList = downloadService.getEmployees(fUserID);
			resp = JSONObject.toJSONString(employeeList);
			break;
		case "t_BOS200000001Entry2":
			UIParameter uiParameter = downloadService.getUIParameter(fNumber);
			List<UIParameter> uiParamList = new ArrayList<UIParameter>();
			uiParamList.add(uiParameter);
			resp = JSONObject.toJSONString(uiParamList);
			break;			
		case "t_BOS200000002":
			List<SalePolicy> salePlyList = downloadService.getSalePolicys();
			resp = JSONObject.toJSONString(salePlyList);
			break;
		case "t_BOS200000001Entry26":
			SaleOrderParameter param = downloadService.getSaleOrderParameter(fNumber);
			List<SaleOrderParameter> paramList = new ArrayList<SaleOrderParameter>();
			paramList.add(param);
			resp = JSONObject.toJSONString(paramList);
			break;
		case "t_BOS200000001Entry27":
			StockBillParameter param27 = downloadService.getStockBillParameter(fNumber);
			List<StockBillParameter> paramList27 = new ArrayList<StockBillParameter>();
			paramList27.add(param27);
			resp = JSONObject.toJSONString(paramList27);
			break;
		case "t_BOS200000001Entry32":
			PickingMaterialParameter param32 = downloadService.getPickingMaterialParameter(fNumber);
			List<PickingMaterialParameter> paramList32 = new ArrayList<PickingMaterialParameter>();
			paramList32.add(param32);
			resp = JSONObject.toJSONString(paramList32);			
			break;
		case "ICInventory":
//			Long fItemID = null;
//			if(fItemIDStr != null && fItemIDStr.length() > 0) {
//				fItemID = Long.valueOf(fItemIDStr);
//			}
//			Long stockID = null;
//			if(stockIDStr != null && stockIDStr.length() > 0) {
//				stockID = Long.valueOf(stockIDStr);
//			}
			List<Inventory> inventoryList = downloadService.getInventories(fItemIDs, stockIDs);
			resp = JSONObject.toJSONString(inventoryList);
			break;
		}

		// 封装下载数据
		jsonObject.put("Content", resp);
		jsonObject.put("Result", "ok");
		String respStr = jsonObject.toJSONString();
        logger.info("response str:\b\n" + respStr);
		return respStr;
	}

	@ResponseBody
	@RequestMapping(value = "/web/login", method = RequestMethod.POST)
	public String login(@RequestParam(value = "requestStr") String reqStr) {

		// 解析Json
		JSONObject jsonObject = JSONObject.parseObject(reqStr);
		logger.info("request str : \b\n" + jsonObject);
		String empNumber = jsonObject.getString("FEmpNumber");
		String phoneInfo = jsonObject.getString("EMPhone");
		String fClientPwd = jsonObject.getString("FClientPwd");
		// 获取数据
		Employee employee = loadingService.validateEmp(empNumber, null, null);
		if (employee == null) {
			String errJsonStr = ErrorInfo.getErrJsonStr(ErrorInfo.NO_USER_ERROR);
			jsonObject.put("Content", errJsonStr);
			logger.info(errJsonStr);
			return jsonObject.toJSONString();
		}
	    employee = loadingService.validateEmp(empNumber, phoneInfo, null);
	    if (employee == null) {
			String errJsonStr = ErrorInfo.getErrJsonStr(ErrorInfo.NO_MOBILE_REGIST);
			jsonObject.put("Content", errJsonStr);
			logger.info(errJsonStr);
			return jsonObject.toJSONString();
		}
		employee = loadingService.validateEmp(empNumber, phoneInfo, fClientPwd);
		if (employee == null) {
			String errJsonStr = ErrorInfo.getErrJsonStr(ErrorInfo.PASSWORD_ERROR);
			jsonObject.put("Content", errJsonStr);
			logger.info(errJsonStr);
			return jsonObject.toJSONString();
		}
	
		//获取页面参数
		UIParameter uiParameter = downloadService.getUIParameter(empNumber);
		//获取销售订单参数
		SaleOrderParameter saleOrderParameter = downloadService.getSaleOrderParameter(empNumber);
		//获取出库单参数
		StockBillParameter stockBillParameter = downloadService.getStockBillParameter(empNumber);
		//获取领料单参数
		PickingMaterialParameter pickingMaterialParameter = downloadService.getPickingMaterialParameter(empNumber); 
		
		
		Map<String,Object> objMap = new HashMap<String,Object>();
		objMap.put("Employee", employee);
		objMap.put("UIParameter", uiParameter);
		objMap.put("SaleOrderParameter", saleOrderParameter);
		objMap.put("StockBillParameter", stockBillParameter);
		objMap.put("pickingParameter", pickingMaterialParameter);
		String content = JSONObject.toJSONString(objMap);
		jsonObject.put("Content", content);
		
		String jsonStr = jsonObject.toJSONString();
		logger.info("response str : \b\n" + jsonStr );
		return jsonStr;
	}
	@ResponseBody
	@RequestMapping(value = "/web/update_password", method = RequestMethod.POST)
	public String updatePassword(@RequestParam(value = "requestStr") String reqStr) {
		
		// 解析Json
		JSONObject jsonObject = JSONObject.parseObject(reqStr);
		logger.info("request str : \b\n" + jsonObject);
		String fUserID = jsonObject.getString("FUserID");
		String newPassword = jsonObject.getString("NewPassword");
		loadingService.updatePassword(fUserID, newPassword);
		Map<String,String> result = new HashMap<String,String>();
		result.put("result", "ok");
		String content = JSONObject.toJSONString(result);
		jsonObject.put("Content", content);
		String jsonStr = jsonObject.toJSONString();
		logger.info("response str : \b\n" + jsonStr);
		return jsonStr;
	}
	@ResponseBody
	@RequestMapping(value = "/web/update_organization", method = RequestMethod.POST)
	public String updateOrganization(@RequestParam(value = "requestStr") String reqStr) {
		// 解析Json
		JSONObject jsonObject = JSONObject.parseObject(reqStr);
		logger.info("request str : \b\n" + jsonObject);
		// 获取订单对象
		String content = jsonObject.getString("Content");
		Organization org = JSONObject.parseObject(content, Organization.class);
		//更新数据
	    Integer state = uploadService.updateOrganization(org);
	    //返回结果
	    Map<String,String> result = new HashMap<String,String>();
	    if(state != null && state == 1) {
	    	result.put("result", "ok");
	    } else {
	    	result.put("result", "failure");
	    }
		String res = JSONObject.toJSONString(result);
		jsonObject.put("Content", res);
		String jsonStr = jsonObject.toJSONString();
		logger.info("response str : \b\n" + jsonStr);
		return jsonStr;
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/web/upload", method = RequestMethod.POST)
	public String upload(@RequestParam(value = "requestStr") String reqStr) {

		// 解析Json
		JSONObject jsonObject = JSONObject.parseObject(reqStr);
		logger.info("request str : \b\n" + jsonObject);
		// 获取订单对象
		String content = jsonObject.getString("Content");
		String userIdStr = jsonObject.getString("FUserID");
		int fUserID = -1;
		if(!StringUtils.isEmpty(userIdStr)) {
			fUserID = Integer.valueOf(userIdStr);
		}
		//判断用户是否禁用
		Integer isForbidden = loadingService.isForbidden(fUserID);
		if(isForbidden != null && isForbidden == 1) {
			String errJsonStr = ErrorInfo.getErrJsonStr(ErrorInfo.FORBIDDEN_USER_ERROR);
			jsonObject.put("Content", errJsonStr);
			logger.info(errJsonStr);
			return jsonObject.toJSONString();
		}
		
		//业务类型
		String businessType = jsonObject.getString("BusinessType");
		SaleOrder saleOrder = JSONObject.parseObject(content, SaleOrder.class);
		switch(Integer.valueOf(businessType)) {
		   case BUZZINESS_TYPE_SALE_ORDER:
			   uploadService.uploadSaleOrder(saleOrder);
			   break;
		   case BUZZINESS_TYPE_STOCK_OUT:
		   case BUZZINESS_TYPE_PICKING_MATERIAL:   
			   StockBill stockBill = BeanUtil.changeToStockBill(saleOrder, 1);
			   uploadService.uploadStockBill(stockBill);
			   break;
		   case BUZZINESS_TYPE_STOCK_RETURN:
			   StockBill stockRtnBill = BeanUtil.changeToStockBill(saleOrder, -1);
			   stockRtnBill.setfROB(-1);
			   uploadService.uploadStockBill(stockRtnBill);
			   break;
			   
		}
		Map<String,String> result = new HashMap<String,String>();
		result.put("result", "ok");
		String res = JSONObject.toJSONString(result);
		jsonObject.put("Content", res);
		String jsonStr = jsonObject.toJSONString();
		logger.info("response str : \b\n" + jsonStr);
		return jsonStr;
	}
	@ResponseBody
	@RequestMapping(value = "/web/uploads", method = RequestMethod.POST)
	public String uploads(@RequestParam(value = "requestStr") String reqStr) {
		
		// 解析Json
		JSONObject jsonObject = JSONObject.parseObject(reqStr);
		logger.info("request str : \b\n" + jsonObject);
		// 获取订单对象
		String content = jsonObject.getString("Content");
		String userIdStr = jsonObject.getString("FUserID");
		int fUserID = -1; 
		if(!StringUtils.isEmpty(userIdStr)) {
			fUserID = Integer.valueOf(userIdStr);
		}
		//判断用户是否禁用
		Integer isForbidden = loadingService.isForbidden(fUserID);
		if(isForbidden != null && isForbidden == 1) {
			String errJsonStr = ErrorInfo.getErrJsonStr(ErrorInfo.FORBIDDEN_USER_ERROR);
			jsonObject.put("Content", errJsonStr);
			jsonObject.put("Result", "error");
			logger.info(errJsonStr);
			return jsonObject.toJSONString();
		}
		//业务类型
		String businessType = jsonObject.getString("BusinessType");
		List<SaleOrder> saleOrderList = JSONObject.parseArray(content, SaleOrder.class);
		if(saleOrderList != null && saleOrderList.size() > 0) {
			//判断用户是否禁用
			
			//Integer isForbidden = loadingService.isForbidden(fUserID);
//			if(isForbidden != null && isForbidden == 1) {
//				String errJsonStr = ErrorInfo.getErrJsonStr(ErrorInfo.FORBIDDEN_USER_ERROR);
//				jsonObject.put("Content", errJsonStr);
//				jsonObject.put("Result", "error");
//				logger.info(errJsonStr);
//				return jsonObject.toJSONString();
//			} 
			switch(Integer.valueOf(businessType)) {
			   case BUZZINESS_TYPE_SALE_ORDER:			
				   for(SaleOrder saleOrder : saleOrderList) {
				       uploadService.uploadSaleOrder(saleOrder);
				   }
				   break;
			   case BUZZINESS_TYPE_STOCK_OUT:
			   case BUZZINESS_TYPE_PICKING_MATERIAL:   
				   for(SaleOrder saleOrder : saleOrderList) {
					   StockBill stockBill = BeanUtil.changeToStockBill(saleOrder, 1);
					   uploadService.uploadStockBill(stockBill);
				   }
				   break;	
			   case BUZZINESS_TYPE_STOCK_RETURN:
				   for(SaleOrder saleOrder : saleOrderList) {
					   StockBill stockBill = BeanUtil.changeToStockBill(saleOrder, -1);
					   stockBill.setfROB(-1);
					   uploadService.uploadStockBill(stockBill);
				   }
				   break;	   
			}

		}
		Map<String,String> result = new HashMap<String,String>();
		result.put("result", "ok");
		String res = JSONObject.toJSONString(result);
		jsonObject.put("Content", res);
		String jsonStr = jsonObject.toJSONString();
		logger.info("response str : \b\n" + jsonStr);
		return jsonStr;
	}
	@ResponseBody
	@RequestMapping(value = "/web/downloadStatic", method = RequestMethod.POST)
	public String downloadStatic(@RequestParam(value = "requestStr") String reqStr) {
		// 解析Json
		JSONObject jsonObject = JSONObject.parseObject(reqStr);
		logger.info("request str : \b\n" + jsonObject);
		String empIDStr = jsonObject.getString("empID");
		Integer empID = Integer.valueOf(empIDStr);
		String startDate = jsonObject.getString("startDate");
		String endDate = jsonObject.getString("endDate");
		String staticType = jsonObject.getString("staticType");
		List<SaleOrderStatic> staticList = null;
		String resp = null;
		switch(staticType) {
		  case "other" :
			  staticList = downloadService.getSOrderGoodStatic(startDate, endDate, empID);
			  break;
		  default :
			  staticList = downloadService.getSaleOrderStatic(startDate, endDate, empID);
		}
		resp = JSONObject.toJSONString(staticList);
		// 封装下载数据
		jsonObject.put("Content", resp);
		String respStr = jsonObject.toJSONString();
		logger.info("response str : \b\n" + respStr);
		return respStr;
	}
	
	

}
