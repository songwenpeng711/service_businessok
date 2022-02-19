package com.kingdee.songwp.businessok.bean;

import java.util.Date;

public class SaleOrderEntry {

	//公司机构内码
	private String fBrNo = "0";
	//单据ID
	private int fInterID;
	//分录行号
	private int fEntryID;
	//商品ID
	private long fItemID;
	//基本单位数量
	private float fQty;
	//基本单位单价
	private float fPrice;
	//金额
	private float fAmount;
	//折扣率
	private float fTaxRate = 0;
	//折扣额
	private float fTaxAmount = 0;
	//赠品备注为“赠品”
	private String note;
	//交货日期
	private Date fDate;
	//计量单位ID
	private long fUnitID;
	//单价
	private float fAuxPrice;
	//数量
	private float fAuxQty;
	//税率
	private float fCESS = 0;
	//建议交货日期
	private Date fAdviceConsignDate;
	//价税合计
	private float fAllAmount;
	//价税合计（本位币）
	private float fAllStdAmount;
	//实际含税单价
	private float fAuxPriceDiscount;
	//基本单位实际单价
	private float fPriceDiscount;
	//销项税额
	private float fTaxAmt = 0;
	//含税单价
	private float fAuxTaxPrice;
	//基本单位含税单价
	private float fTaxPrice;
	//条形码
	private String fBarCode;
	//仓库ID
	private Long fStockID;
	//批次号
	private String fBatchNo;
	
	//生产采购日期
	private String fKFDate;
    //保质期
	private Integer fKFPeroid;
	//有效期止
	private String fPeriodDate;
	//综合单位数量
	//private float fComplexQty;
	
	private Float fSecCoefficient;
	private Float fSecQty;
	
	public SaleOrderEntry() {
		
	}
	
	public SaleOrderEntry(int fInterID, long fItemID, float fQty, float fPrice, 
			float fAmount,String  note, Date fDate, long fUnitID, float fAuxPrice, float fAuxQty,
			Date fAdviceConsignDate) {
		super();
		this.fInterID = fInterID;
		this.fItemID = fItemID;
		this.fQty = fQty;
		this.fPrice = fPrice;
		this.fAmount = fAmount;
		this.note = note;
		this.fDate = fDate;
		this.fUnitID = fUnitID;
		this.fAuxPrice = fAuxPrice;
		this.fAuxQty = fAuxQty;
		this.fAdviceConsignDate = fAdviceConsignDate;
		this.fAllAmount = fAmount;
		this.fAllStdAmount = fAmount;
		this.fAuxPriceDiscount = fAuxPrice;
		this.fPriceDiscount = fAuxPrice;
		this.fAuxTaxPrice = fAuxPrice;
		this.fTaxPrice = fAuxPrice;
		//this.fComplexQty = fComplexQty;
	}
	
	public String getfBrNo() {
		return fBrNo;
	}
	public void setfBrNo(String fBrNo) {
		this.fBrNo = fBrNo;
	}
	public int getfInterID() {
		return fInterID;
	}
	public void setfInterID(int fInterID) {
		this.fInterID = fInterID;
	}
	public int getfEntryID() {
		return fEntryID;
	}
	public void setfEntryID(int fEntryID) {
		this.fEntryID = fEntryID;
	}
	public long getfItemID() {
		return fItemID;
	}
	public void setfItemID(long fItemID) {
		this.fItemID = fItemID;
	}
	public float getfQty() {
		return fQty;
	}
	public void setfQty(float fQty) {
		this.fQty = fQty;
	}
	public float getfPrice() {
		return fPrice;
	}
	public void setfPrice(float fPrice) {
		this.fPrice = fPrice;
	}
	public float getfAmount() {
		return fAmount;
	}
	public void setfAmount(float fAmount) {
		this.fAmount = fAmount;
	}
	public float getfTaxRate() {
		return fTaxRate;
	}
	public void setfTaxRate(float fTaxRate) {
		this.fTaxRate = fTaxRate;
	}
	public float getfTaxAmount() {
		return fTaxAmount;
	}
	public void setfTaxAmount(float fTaxAmount) {
		this.fTaxAmount = fTaxAmount;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getfDate() {
		return fDate;
	}
	public void setfDate(Date fDate) {
		this.fDate = fDate;
	}
	public long getfUnitID() {
		return fUnitID;
	}
	public void setfUnitID(long fUnitID) {
		this.fUnitID = fUnitID;
	}
	public float getfAuxPrice() {
		return fAuxPrice;
	}
	public void setfAuxPrice(float fAuxPrice) {
		this.fAuxPrice = fAuxPrice;
	}
	public float getfAuxQty() {
		return fAuxQty;
	}
	public void setfAuxQty(float fAuxQty) {
		this.fAuxQty = fAuxQty;
	}
	public float getfCESS() {
		return fCESS;
	}
	public void setfCESS(float fCESS) {
		this.fCESS = fCESS;
	}
	public Date getfAdviceConsignDate() {
		return fAdviceConsignDate;
	}
	public void setfAdviceConsignDate(Date fAdviceConsignDate) {
		this.fAdviceConsignDate = fAdviceConsignDate;
	}
	public float getfAllAmount() {
		return fAllAmount;
	}
	public void setfAllAmount(float fAllAmount) {
		this.fAllAmount = fAllAmount;
	}
	public float getfAllStdAmount() {
		return fAllStdAmount;
	}
	public void setfAllStdAmount(float fAllStdAmount) {
		this.fAllStdAmount = fAllStdAmount;
	}
	public float getfAuxPriceDiscount() {
		return fAuxPriceDiscount;
	}
	public void setfAuxPriceDiscount(float fAuxPriceDiscount) {
		this.fAuxPriceDiscount = fAuxPriceDiscount;
	}
	public float getfPriceDiscount() {
		return fPriceDiscount;
	}
	public void setfPriceDiscount(float fPriceDiscount) {
		this.fPriceDiscount = fPriceDiscount;
	}
	public float getfTaxAmt() {
		return fTaxAmt;
	}
	public void setfTaxAmt(float fTaxAmt) {
		this.fTaxAmt = fTaxAmt;
	}
	public float getfAuxTaxPrice() {
		return fAuxTaxPrice;
	}
	public void setfAuxTaxPrice(float fAuxTaxPrice) {
		this.fAuxTaxPrice = fAuxTaxPrice;
	}
	public float getfTaxPrice() {
		return fTaxPrice;
	}
	public void setfTaxPrice(float fTaxPrice) {
		this.fTaxPrice = fTaxPrice;
	}
	
    public String getfBarCode() {
		return fBarCode;
	}

	public void setfBarCode(String fBarCode) {
		this.fBarCode = fBarCode;
	}


	public Long getfStockID() {
		return fStockID;
	}

	public void setfStockID(Long fStockID) {
		this.fStockID = fStockID;
	}
	
	public String getfBatchNo() {
		return fBatchNo;
	}

	public void setfBatchNo(String fBatchNo) {
		this.fBatchNo = fBatchNo;
	}
	
	public String getfKFDate() {
		return fKFDate;
	}

	public void setfKFDate(String fKFDate) {
		this.fKFDate = fKFDate;
	}

	public Integer getfKFPeroid() {
		return fKFPeroid;
	}

	public void setfKFPeroid(Integer fKFPeroid) {
		this.fKFPeroid = fKFPeroid;
	}

	public String getfPeriodDate() {
		return fPeriodDate;
	}

	public void setfPeriodDate(String fPeriodDate) {
		this.fPeriodDate = fPeriodDate;
	}
	
	public Float getfSecCoefficient() {
		return fSecCoefficient;
	}

	public void setfSecCoefficient(Float fSecCoefficient) {
		this.fSecCoefficient = fSecCoefficient;
	}

	public Float getfSecQty() {
		return fSecQty;
	}

	public void setfSecQty(Float fSecQty) {
		this.fSecQty = fSecQty;
	}

	@Override
	public String toString() {
		return "SaleOrderEntry [fBrNo=" + fBrNo + ", fInterID=" + fInterID + ", fEntryID=" + fEntryID + ", fItemID="
				+ fItemID + ", fQty=" + fQty + ", fPrice=" + fPrice + ", fAmount=" + fAmount + ", fTaxRate=" + fTaxRate
				+ ", fTaxAmount=" + fTaxAmount + ", note=" + note + ", fDate=" + fDate + ", fUnitID=" + fUnitID
				+ ", fAuxPrice=" + fAuxPrice + ", fAuxQty=" + fAuxQty + ", fCESS=" + fCESS + ", fAdviceConsignDate="
				+ fAdviceConsignDate + ", fAllAmount=" + fAllAmount + ", fAllStdAmount=" + fAllStdAmount
				+ ", fAuxPriceDiscount=" + fAuxPriceDiscount + ", fPriceDiscount=" + fPriceDiscount + ", fTaxAmt="
				+ fTaxAmt + ", fAuxTaxPrice=" + fAuxTaxPrice + ", fTaxPrice=" + fTaxPrice + ", fBarCode=" + fBarCode
				+ ", fStockID=" + fStockID + ", fBatchNo=" + fBatchNo + ", fKFDate=" + fKFDate + ", fKFPeroid="
				+ fKFPeroid + ", fPeriodDate=" + fPeriodDate + ", fSecCoefficient=" + fSecCoefficient + ", fSecQty="
				+ fSecQty + "]";
	}
	
}
