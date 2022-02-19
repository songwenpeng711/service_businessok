package com.kingdee.songwp.businessok.bean;
/**
 * 出库单商品
 * @author songwp 20191229
 *
 */
public class StockBillEntry {
	
	//公司机构内码
	private String fBrNo = "0";
	//单据ID
	private Integer fInterID;
	//分录行号
	private int fEntryID;
	//物料编码
	private int fItemID;
	//条形码
	private String fBarCode;
	//仓库ID
    private int fDCStockID;
    //计量单位ID
  	private long fUnitID;
    //数量
  	private float fAuxQty;
    //基本单位数量
  	private float fQty;
    //单价
  	private float fAuxPrice;
    //金额
  	private float fAmount;
  	//批次号
  	private String fBatchNo;
  	//计划模式
  	private Integer fPlanMode = 14036;
  	
	//生产采购日期
	private String fKFDate;
    //保质期
	private Integer fKFPeroid;
	//有效期止
	private String fPeriodDate;
	//备注
	private String fNote;
	//辅助单价换算率
	private Float fSecCoefficient;
	//辅助单价换算量
	private Float fSecQty;
	
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
	public int getfEntryID() {
		return fEntryID;
	}
	public void setfEntryID(int fEntryID) {
		this.fEntryID = fEntryID;
	}
	public int getfItemID() {
		return fItemID;
	}
	public void setfItemID(int fItemID) {
		this.fItemID = fItemID;
	}
	public String getfBarCode() {
		return fBarCode;
	}
	public void setfBarCode(String fBarCode) {
		this.fBarCode = fBarCode;
	}
	public int getfDCStockID() {
		return fDCStockID;
	}
	public void setfDCStockID(int fDCStockID) {
		this.fDCStockID = fDCStockID;
	}
	public long getfUnitID() {
		return fUnitID;
	}
	public void setfUnitID(long fUnitID) {
		this.fUnitID = fUnitID;
	}
	public float getfAuxQty() {
		return fAuxQty;
	}
	public void setfAuxQty(float fAuxQty) {
		this.fAuxQty = fAuxQty;
	}
	public float getfQty() {
		return fQty;
	}
	public void setfQty(float fQty) {
		this.fQty = fQty;
	}
	public float getfAuxPrice() {
		return fAuxPrice;
	}
	public void setfAuxPrice(float fAuxPrice) {
		this.fAuxPrice = fAuxPrice;
	}
	public float getfAmount() {
		return fAmount;
	}
	public void setfAmount(float fAmount) {
		this.fAmount = fAmount;
	}
	public String getfBatchNo() {
		return fBatchNo;
	}
	public void setfBatchNo(String fBatchNo) {
		this.fBatchNo = fBatchNo;
	}
	public Integer getfPlanMode() {
		return fPlanMode;
	}
	public void setfPlanMode(Integer fPlanMode) {
		this.fPlanMode = fPlanMode;
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
	
	public String getfNote() {
		return fNote;
	}
	public void setfNote(String fNote) {
		this.fNote = fNote;
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
		return "ICStockBillEntry [fBrNo=" + fBrNo + ", fInterID=" + fInterID + ", fEntryID=" + fEntryID + ", fItemID="
				+ fItemID + ", fBarCode=" + fBarCode + ", fDCStockID=" + fDCStockID + ", fUnitID=" + fUnitID
				+ ", fAuxQty=" + fAuxQty + ", fQty=" + fQty + ", fAuxPrice=" + fAuxPrice + ", fAmount=" + fAmount
				+ ", fBatchNo=" + fBatchNo + ", fPlanMode=" + fPlanMode + "]";
	}
  	
  	
}
