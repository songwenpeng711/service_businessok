package com.kingdee.songwp.businessok.bean;

/**
 * 商品表实体bean
 * 
 * @author songwenpeng 20180905
 *
 */
public class Goods {

	// 商品ID
	private int fItemID;
	// 商品代码
	private String fNumber;
	// 商品名称
	private String fName;
	// 条形码
	private String fBarCode;
	// 规格型号
	private String fmodel;
	// 单位组ID
	private int fUnitGroupID;
	// 单位ID
	private int fUnitID;
	// 采购单位ID
	private int fOrderUnitID;
	// 销售单位ID
	private int fSaleUnitID;
	// 销售单位ID
	private int fStoreUnitID;
	// 数量精度
	private int fQtyDecimal;
	// 单价精度
	private int fPriceDecimal;
	// 是否有批次号
	private int fBatchManager;
	// 用户ID
	private int fUserID;
	//是否有保质期
	private Boolean fIsKFPeriod;
	
	private Integer fKFPeriod;

	public int getfItemID() {
		return fItemID;
	}

	public void setfItemID(int fItemID) {
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

	public String getfBarCode() {
		return fBarCode;
	}

	public void setfBarCode(String fBarCode) {
		this.fBarCode = fBarCode;
	}

	public String getFmodel() {
		return fmodel;
	}

	public void setFmodel(String fmodel) {
		this.fmodel = fmodel;
	}

	public int getfUnitGroupID() {
		return fUnitGroupID;
	}

	public void setfUnitGroupID(int fUnitGroupID) {
		this.fUnitGroupID = fUnitGroupID;
	}

	public int getfUnitID() {
		return fUnitID;
	}

	public void setfUnitID(int fUnitID) {
		this.fUnitID = fUnitID;
	}

	public int getfOrderUnitID() {
		return fOrderUnitID;
	}

	public void setfOrderUnitID(int fOrderUnitID) {
		this.fOrderUnitID = fOrderUnitID;
	}

	public int getfSaleUnitID() {
		return fSaleUnitID;
	}

	public void setfSaleUnitID(int fSaleUnitID) {
		this.fSaleUnitID = fSaleUnitID;
	}

	public int getfStoreUnitID() {
		return fStoreUnitID;
	}

	public void setfStoreUnitID(int fStoreUnitID) {
		this.fStoreUnitID = fStoreUnitID;
	}

	public int getfQtyDecimal() {
		return fQtyDecimal;
	}

	public void setfQtyDecimal(int fQtyDecimal) {
		this.fQtyDecimal = fQtyDecimal;
	}

	public int getfPriceDecimal() {
		return fPriceDecimal;
	}

	public void setfPriceDecimal(int fPriceDecimal) {
		this.fPriceDecimal = fPriceDecimal;
	}

	
	
	public int getfUserID() {
		return fUserID;
	}

	public void setfUserID(int fUserID) {
		this.fUserID = fUserID;
	}
	
	public int getfBatchManager() {
		return fBatchManager;
	}

	public void setfBatchManager(int fBatchManager) {
		this.fBatchManager = fBatchManager;
	}
	
	public Boolean getfIsKFPeriod() {
		return fIsKFPeriod;
	}

	public void setfIsKFPeriod(Boolean fIsKFPeriod) {
		this.fIsKFPeriod = fIsKFPeriod;
	}
	
	public Integer getfKFPeriod() {
		return fKFPeriod;
	}

	public void setfKFPeriod(Integer fKFPeriod) {
		this.fKFPeriod = fKFPeriod;
	}

	@Override
	public String toString() {
		return "Goods [fItemID=" + fItemID + ", fNumber=" + fNumber + ", fName=" + fName + ", fBarCode=" + fBarCode
				+ ", fmodel=" + fmodel + ", fUnitGroupID=" + fUnitGroupID + ", fUnitID=" + fUnitID + ", fOrderUnitID="
				+ fOrderUnitID + ", fSaleUnitID=" + fSaleUnitID + ", fStoreUnitID=" + fStoreUnitID + ", fQtyDecimal="
				+ fQtyDecimal + ", fPriceDecimal=" + fPriceDecimal + ", fBatchManager=" + fBatchManager + ", fUserID="
				+ fUserID + ", fIsKFPeriod=" + fIsKFPeriod + ", fKFPeriod=" + fKFPeriod + "]";
	}

	

}
