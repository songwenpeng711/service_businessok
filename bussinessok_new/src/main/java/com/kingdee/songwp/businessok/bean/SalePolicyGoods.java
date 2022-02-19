package com.kingdee.songwp.businessok.bean;

public class SalePolicyGoods {
	
	//销售政策商品信息id
	private Integer fEntryID;
	//销售政策id
	private Integer fID;
	//商品id
	private Integer fSaleItem;
	//商品单位id
	private Integer fSaleUnit;
	//销售总数量
	private float fSaleQty;
	//销售优惠减少价格
	private float fSalePrice;
	//销售总金额
	private float fSaleAmount;
	
	public SalePolicyGoods() {
		
	}
	
	public SalePolicyGoods(Integer fEntryID, Integer fID, Integer fSaleItem, Integer fSaleUnit, float fSaleQty,
			float fSaleAmount) {
		super();
		this.fEntryID = fEntryID;
		this.fID = fID;
		this.fSaleItem = fSaleItem;
		this.fSaleUnit = fSaleUnit;
		this.fSaleQty = fSaleQty;
		this.fSaleAmount = fSaleAmount;
	}

	public Integer getfEntryID() {
		return fEntryID;
	}

	public void setfEntryID(Integer fEntryID) {
		this.fEntryID = fEntryID;
	}

	public Integer getfID() {
		return fID;
	}

	public void setfID(Integer fID) {
		this.fID = fID;
	}

	public Integer getfSaleItem() {
		return fSaleItem;
	}

	public void setfSaleItem(Integer fSaleItem) {
		this.fSaleItem = fSaleItem;
	}

	public Integer getfSaleUnit() {
		return fSaleUnit;
	}

	public void setfSaleUnit(Integer fSaleUnit) {
		this.fSaleUnit = fSaleUnit;
	}

	public float getfSaleQty() {
		return fSaleQty;
	}

	public void setfSaleQty(float fSaleQty) {
		this.fSaleQty = fSaleQty;
	}

	public float getfSaleAmount() {
		return fSaleAmount;
	}

	public void setfSaleAmount(float fSaleAmount) {
		this.fSaleAmount = fSaleAmount;
	}
	
	public float getfSalePrice() {
		return fSalePrice;
	}

	public void setfSalePrice(float fSalePrice) {
		this.fSalePrice = fSalePrice;
	}

	@Override
	public String toString() {
		return "SalePolicyGoods [fEntryID=" + fEntryID + ", fID=" + fID + ", fSaleItem=" + fSaleItem + ", fSaleUnit="
				+ fSaleUnit + ", fSaleQty=" + fSaleQty + ", fSaleAmount=" + fSaleAmount + "]";
	}

	
	

}
