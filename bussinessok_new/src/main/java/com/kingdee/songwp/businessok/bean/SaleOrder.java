package com.kingdee.songwp.businessok.bean;

import java.util.Date;
import java.util.List;

public class SaleOrder {

	//公司机构内码
	private String fBrNo = "0";
	//单据ID
    private int fInterID;
    //单据编号
    private String fBillNo;
    //货币类型
    private int fCurrencyID = 1;
    //客户ID
    private long fCustID;
    //订单日期
    private Date fDate;
    //销售方式
    private int fSaleStyle;
    //部门ID
    private long fDeptID;
    //员工ID
    private long fEmpID;
    //制单人ID
    private long fBillerID;
    //单据类型
    private int fTranType = 81;
    //汇率
    private int fExchangeRate = 1;
    //结算日期
    private Date fSettleDate;
    //销售范围
    private int fAreaPS;
    //打印次数
    private int fPrintCount;
    //手机单号
    private String fFHtPhoneNo;
    //业务方式
    private int fBizTyp;
    //仓库ID
    private Long fStockID;
    //摘要
    private String fExplanation;  
    
    private List<SaleOrderEntry> saleOrderEntryList;
    
    
    public SaleOrder() {
    	
    }
    
	public SaleOrder(int fInterID, String fBillNo, long fCustID, Date fDate, int fSaleStyle,
			long fDeptID, long fEmpID, long fBillerID, Date fSettleDate, int fAreaPS, int fPrintCount,
			String fFHtPhoneNo, String fExplanation) {
		super();
		this.fInterID = fInterID;
		this.fBillNo = fBillNo;
		this.fCustID = fCustID;
		this.fDate = fDate;
		this.fSaleStyle = fSaleStyle;
		this.fDeptID = fDeptID;
		this.fEmpID = fEmpID;
		this.fBillerID = fBillerID;
		this.fSettleDate = fSettleDate;
		this.fAreaPS = fAreaPS;
		this.fPrintCount = fPrintCount;
		this.fFHtPhoneNo = fFHtPhoneNo;
		this.fExplanation = fExplanation;
	}
	
	
	public String getfBarNo() {
		return fBrNo;
	}

	public void setfBarNo(String fBrNo) {
		this.fBrNo = fBrNo;
	}

	public int getfInterID() {
		return fInterID;
	}
	public void setfInterID(int fInterID) {
		this.fInterID = fInterID;
	}
	public String getfBillNo() {
		return fBillNo;
	}
	public void setfBillNo(String fBillNo) {
		this.fBillNo = fBillNo;
	}
	public int getfCurrencyID() {
		return fCurrencyID;
	}
	public void setfCurrencyID(int fCurrencyID) {
		this.fCurrencyID = fCurrencyID;
	}
	public long getfCustID() {
		return fCustID;
	}
	public void setfCustID(long fCustID) {
		this.fCustID = fCustID;
	}
	public Date getfDate() {
		return fDate;
	}
	public void setfDate(Date fDate) {
		this.fDate = fDate;
	}
	public int getfSaleStyle() {
		return fSaleStyle;
	}
	public void setfSaleStyle(int fSaleStyle) {
		this.fSaleStyle = fSaleStyle;
	}
	public long getfDeptID() {
		return fDeptID;
	}
	public void setfDeptID(long fDeptID) {
		this.fDeptID = fDeptID;
	}
	public long getfEmpID() {
		return fEmpID;
	}
	public void setfEmpID(long fEmpID) {
		this.fEmpID = fEmpID;
	}
	public long getfBillerID() {
		return fBillerID;
	}
	public void setfBillerID(long fBillerID) {
		this.fBillerID = fBillerID;
	}
	public int getfTranType() {
		return fTranType;
	}
	public void setfTranType(int fTranType) {
		this.fTranType = fTranType;
	}
	public int getfExchangeRate() {
		return fExchangeRate;
	}
	public void setfExchangeRate(int fExchangeRate) {
		this.fExchangeRate = fExchangeRate;
	}
	public Date getfSettleDate() {
		return fSettleDate;
	}
	public void setfSettleDate(Date fSettleDate) {
		this.fSettleDate = fSettleDate;
	}
	public int getfAreaPS() {
		return fAreaPS;
	}
	public void setfAreaPS(int fAreaPS) {
		this.fAreaPS = fAreaPS;
	}
	public int getfPrintCount() {
		return fPrintCount;
	}
	public void setfPrintCount(int fPrintCount) {
		this.fPrintCount = fPrintCount;
	}
	public String getfFHtPhoneNo() {
		return fFHtPhoneNo;
	}
	public void setfFHtPhoneNo(String fFHtPhoneNo) {
		this.fFHtPhoneNo = fFHtPhoneNo;
	}
	
	public String getfBrNo() {
		return fBrNo;
	}

	public void setfBrNo(String fBrNo) {
		this.fBrNo = fBrNo;
	}
	
	public int getfBizTyp() {
		return fBizTyp;
	}

	public void setfBizTyp(int fBizTyp) {
		this.fBizTyp = fBizTyp;
	}
	
	public Long getfStockID() {
		return fStockID;
	}

	public void setfStockID(Long fStockID) {
		this.fStockID = fStockID;
	}
	
	public String getfExplanation() {
		return fExplanation;
	}

	public void setfExplanation(String fExplanation) {
		this.fExplanation = fExplanation;
	}

	public List<SaleOrderEntry> getSaleOrderEntryList() {
		return saleOrderEntryList;
	}

	public void setSaleOrderEntryList(List<SaleOrderEntry> saleOrderEntryList) {
		this.saleOrderEntryList = saleOrderEntryList;
	}

	@Override
	public String toString() {
		return "SaleOrder [fBrNo=" + fBrNo + ", fInterID=" + fInterID + ", fBillNo=" + fBillNo + ", fCurrencyID="
				+ fCurrencyID + ", fCustID=" + fCustID + ", fDate=" + fDate + ", fSaleStyle=" + fSaleStyle
				+ ", fDeptID=" + fDeptID + ", fEmpID=" + fEmpID + ", fBillerID=" + fBillerID + ", fTranType="
				+ fTranType + ", fExchangeRate=" + fExchangeRate + ", fSettleDate=" + fSettleDate + ", fAreaPS="
				+ fAreaPS + ", fPrintCount=" + fPrintCount + ", fFHtPhoneNo=" + fFHtPhoneNo + ", fBizTyp=" + fBizTyp
				+ ", fStockID=" + fStockID + ", fExplanation=" + fExplanation + ", saleOrderEntryList="
				+ saleOrderEntryList + "]";
	}
       
}
