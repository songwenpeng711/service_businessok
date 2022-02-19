package com.kingdee.songwp.businessok.bean;

public class SalePolicyPro {
	
	//销售政策商品信息id
	private Integer fEntryID;
	//销售政策id
	private Integer fID;
	//赠品id
	private Integer fProItem;
	//赠品单位id
	private Integer fProUnit;
	//赠品总数量
	private float fProQty;
	//赠品总金额
	private float fProAmount;
	
	public SalePolicyPro() {
		
	}
	
	public SalePolicyPro(Integer fEntryID, Integer fID, Integer fProItem, Integer fProUnit, float fProQty,
			float fProAmount) {
		super();
		this.fEntryID = fEntryID;
		this.fID = fID;
		this.fProItem = fProItem;
		this.fProUnit = fProUnit;
		this.fProQty = fProQty;
		this.fProAmount = fProAmount;
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

	public Integer getfProItem() {
		return fProItem;
	}

	public void setfProItem(Integer fProItem) {
		this.fProItem = fProItem;
	}

	public Integer getfProUnit() {
		return fProUnit;
	}

	public void setfProUnit(Integer fProUnit) {
		this.fProUnit = fProUnit;
	}

	public float getfProQty() {
		return fProQty;
	}

	public void setfProQty(float fProQty) {
		this.fProQty = fProQty;
	}

	public float getfProAmount() {
		return fProAmount;
	}

	public void setfProAmount(float fProAmount) {
		this.fProAmount = fProAmount;
	}

	@Override
	public String toString() {
		return "SalePolicyPro [fEntryID=" + fEntryID + ", fID=" + fID + ", fProItem=" + fProItem + ", fProUnit="
				+ fProUnit + ", fProQty=" + fProQty + ", fProAmount=" + fProAmount + "]";
	}
	
	

}
