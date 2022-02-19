package com.kingdee.songwp.businessok.bean;
/**
 * 库存信息
 * @author songwp 20191213
 *
 */
public class Inventory {
	//商品ID
	private Long fItemID;
	//商品编码
	private String fNumber;
	//商品名称
	private String fName;
	//单位ID
	private Long fUnitID;
	//单位名称
	private String fUnitName;
	//仓库ID
	private Long fStockID;
	//仓库编码
	private String fSNumber;
	//仓库名称
	private String fSName;
	//库存数量
	private Float fQty;
	//批次号
	private String fBatchNo;
	//入库时间
	private String fSDate;
	//存库时长
	private Long fPeriod;
	//结束库存时间
	private String fEDate;
	public Long getfItemID() {
		return fItemID;
	}
	public void setfItemID(Long fItemID) {
		this.fItemID = fItemID;
	}
	public String getfNumber() {
		return fNumber;
	}
	public void setfNumber(String fNumber) {
		this.fNumber = fNumber;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public Long getfStockID() {
		return fStockID;
	}
	public void setfStockID(Long fStockID) {
		this.fStockID = fStockID;
	}
	public String getfSNumber() {
		return fSNumber;
	}
	public void setfSNumber(String fSNumber) {
		this.fSNumber = fSNumber;
	}
	public String getfSName() {
		return fSName;
	}
	public void setfSName(String fSName) {
		this.fSName = fSName;
	}
	public Float getfQty() {
		return fQty;
	}
	public void setfQty(Float fQty) {
		this.fQty = fQty;
	}
	public String getfBatchNo() {
		return fBatchNo;
	}
	public void setfBatchNo(String fBatchNo) {
		this.fBatchNo = fBatchNo;
	}
	public String getfSDate() {
		return fSDate;
	}
	public void setfSDate(String fSDate) {
		this.fSDate = fSDate;
	}
	public Long getfPeriod() {
		return fPeriod;
	}
	public void setfPeriod(Long fPeriod) {
		this.fPeriod = fPeriod;
	}
	public String getfEDate() {
		return fEDate;
	}
	public void setfEDate(String fEDate) {
		this.fEDate = fEDate;
	}
	
	public Long getfUnitID() {
		return fUnitID;
	}
	public void setfUnitID(Long fUnitID) {
		this.fUnitID = fUnitID;
	}
	public String getfUnitName() {
		return fUnitName;
	}
	public void setfUnitName(String fUnitName) {
		this.fUnitName = fUnitName;
	}
	
	@Override
	public String toString() {
		return "Inventory [fItemID=" + fItemID + ", fNumber=" + fNumber + ", fName=" + fName + ", fUnitID=" + fUnitID
				+ ", fUnitName=" + fUnitName + ", fStockID=" + fStockID + ", fSNumber=" + fSNumber + ", fSName="
				+ fSName + ", fQty=" + fQty + ", fBatchNo=" + fBatchNo + ", fSDate=" + fSDate + ", fPeriod=" + fPeriod
				+ ", fEDate=" + fEDate + "]";
	}
	
}
