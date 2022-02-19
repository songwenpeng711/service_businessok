package com.kingdee.songwp.businessok.bean;

import java.util.Date;
import java.util.List;

/**
   *   出库单
 * @author songwp 20191229
 *
 */
public class StockBill {
	
	//公司机构内码
	private String fBrNo = "0";
	//单据ID
	private Integer fInterID;
	//单据类型
	private Integer fTranType = 21;
	//红蓝字
	private Integer fROB = 1;
	//销售方式
    private int fSaleStyle;
    //销售业务类型
    private int fMarketingStyle;
    //客户ID
    private int fSupplyID;
    //订单日期
    private Date fDate;
    //单据编号
    private String fBillNo;
    //手机单号
    private String fFHtPhoneNo;
    //采购方式
    private Integer fPOStyle;
    //打印次数
    private int fPrintCount;
    //仓库ID
    private int fDCStockID;
    //部门ID
    private int fDeptID;
    //员工ID
    private int fEmpID;
    //验收人
    //private int fFManagerID;
    //负责人
    //private int fManagerID;
    //保管员
    //private int fSManagerID;
    //制单人ID
    private long fBillerID;
    //更新库存方式
    private int fUpStockWhenSave; 
    //摘要
    private String fExplanation;      
    

    
    private List<StockBillEntry> stockBillEntryList;
    
	public String getfBrNo() {
		return fBrNo;
	}
	public void setfBrNo(String fBrNo) {
		this.fBrNo = fBrNo;
	}
	public Integer getfInterID() {
		return fInterID;
	}
	public void setfInterID(Integer fInterID) {
		this.fInterID = fInterID;
	}
	public Integer getfTranType() {
		return fTranType;
	}
	public void setfTranType(Integer fTranType) {
		this.fTranType = fTranType;
	}
	public Integer getfROB() {
		return fROB;
	}
	public void setfROB(Integer fROB) {
		this.fROB = fROB;
	}
	public int getfSaleStyle() {
		return fSaleStyle;
	}
	public void setfSaleStyle(int fSaleStyle) {
		this.fSaleStyle = fSaleStyle;
	}
	public int getfMarketingStyle() {
		return fMarketingStyle;
	}
	public void setfMarketingStyle(int fMarketingStyle) {
		this.fMarketingStyle = fMarketingStyle;
	}
	public int getfSupplyID() {
		return fSupplyID;
	}
	public void setfSupplyID(int fSupplyID) {
		this.fSupplyID = fSupplyID;
	}
	public Date getfDate() {
		return fDate;
	}
	public void setfDate(Date fDate) {
		this.fDate = fDate;
	}
	public String getfBillNo() {
		return fBillNo;
	}
	public void setfBillNo(String fBillNo) {
		this.fBillNo = fBillNo;
	}
	public String getfFHtPhoneNo() {
		return fFHtPhoneNo;
	}
	public void setfFHtPhoneNo(String fFHtPhoneNo) {
		this.fFHtPhoneNo = fFHtPhoneNo;
	}
	public Integer getfPOStyle() {
		return fPOStyle;
	}
	public void setfPOStyle(Integer fPOStyle) {
		this.fPOStyle = fPOStyle;
	}
	public int getfPrintCount() {
		return fPrintCount;
	}
	public void setfPrintCount(int fPrintCount) {
		this.fPrintCount = fPrintCount;
	}
	public int getfDCStockID() {
		return fDCStockID;
	}
	public void setfDCStockID(int fDCStockID) {
		this.fDCStockID = fDCStockID;
	}
	public int getfDeptID() {
		return fDeptID;
	}
	public void setfDeptID(int fDeptID) {
		this.fDeptID = fDeptID;
	}
	public int getfEmpID() {
		return fEmpID;
	}
	public void setfEmpID(int fEmpID) {
		this.fEmpID = fEmpID;
	}
//	public int getfFManagerID() {
//		return fFManagerID;
//	}
//	public void setfFManagerID(int fFManagerID) {
//		this.fFManagerID = fFManagerID;
//	}
//	public int getfManagerID() {
//		return fManagerID;
//	}
//	public void setfManagerID(int fManagerID) {
//		this.fManagerID = fManagerID;
//	}
//	public int getfSManagerID() {
//		return fSManagerID;
//	}
//	public void setfSManagerID(int fSManagerID) {
//		this.fSManagerID = fSManagerID;
//	}
	public long getfBillerID() {
		return fBillerID;
	}
	public void setfBillerID(long fBillerID) {
		this.fBillerID = fBillerID;
	}
	public int getfUpStockWhenSave() {
		return fUpStockWhenSave;
	}
	
	public void setfUpStockWhenSave(int fUpStockWhenSave) {
		this.fUpStockWhenSave = fUpStockWhenSave;
	}
	
	public String getfExplanation() {
		return fExplanation;
	}
	public void setfExplanation(String fExplanation) {
		this.fExplanation = fExplanation;
	}
	public List<StockBillEntry> getStockBillEntryList() {
		return stockBillEntryList;
	}
	public void setStockBillEntryList(List<StockBillEntry> stockBillEntryList) {
		this.stockBillEntryList = stockBillEntryList;
	}
	@Override
	public String toString() {
		return "StockBill [fBrNo=" + fBrNo + ", fInterID=" + fInterID + ", fTranType=" + fTranType + ", fROB=" + fROB
				+ ", fSaleStyle=" + fSaleStyle + ", fMarketingStyle=" + fMarketingStyle + ", fSupplyID=" + fSupplyID
				+ ", fDate=" + fDate + ", fBillNo=" + fBillNo + ", fFHtPhoneNo=" + fFHtPhoneNo + ", fPOStyle="
				+ fPOStyle + ", fPrintCount=" + fPrintCount + ", fDCStockID=" + fDCStockID + ", fDeptID=" + fDeptID
				+ ", fEmpID=" + fEmpID + ", fBillerID=" + fBillerID + ", fUpStockWhenSave=" + fUpStockWhenSave
				+ ", fExplanation=" + fExplanation + ", stockBillEntryList=" + stockBillEntryList + "]";
	}

}
