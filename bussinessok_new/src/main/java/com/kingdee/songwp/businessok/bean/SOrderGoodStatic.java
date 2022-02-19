package com.kingdee.songwp.businessok.bean;
/**
 * 商品统计信息
 * @author songwp 20191111
 *
 */
public class SOrderGoodStatic {
	
	//客户ID
	private Long orgID;
	//商品编号
	private String icItemNumber;
	//商品名称
	private String icItemName;
	//金额
	private float amount;
	
	public SOrderGoodStatic(Long orgID, String icItemNumber, String icItemName, float amount) {
		super();
		this.orgID = orgID;
		this.icItemNumber = icItemNumber;
		this.icItemName = icItemName;
		this.amount = amount;
	}

	public Long getOrgID() {
		return orgID;
	}

	public void setOrgID(Long orgID) {
		this.orgID = orgID;
	}

	public String getIcItemNumber() {
		return icItemNumber;
	}

	public void setIcItemNumber(String icItemNumber) {
		this.icItemNumber = icItemNumber;
	}

	public String getIcItemName() {
		return icItemName;
	}

	public void setIcItemName(String icItemName) {
		this.icItemName = icItemName;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "SOrderGoodStatic [orgID=" + orgID + ", icItemNumber=" + icItemNumber + ", icItemName=" + icItemName
				+ ", amount=" + amount + "]";
	}
	
	
	

}
