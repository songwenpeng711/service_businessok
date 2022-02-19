package com.kingdee.songwp.businessok.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单统计实体
 * @author songwp 20191110
 *
 */
public class SaleOrderStatic {
	
	//客户ID
	private Long orgID;
	//客户名称
	private String orgName;
	//客户地址
	private String orgAddress;
	//金额
	private float amount;
	//订单数量
	private int nums;
	//商品金额
	private List<SOrderGoodStatic> goodsAmount = new ArrayList<SOrderGoodStatic>();
	
	public SaleOrderStatic(Long orgID, String orgName, String orgAddress, float amount, int nums) {
		super();
		this.orgID = orgID;
		this.orgName = orgName;
		this.orgAddress = orgAddress;
		this.amount = amount;
		this.nums = nums;
	}

	public Long getOrgID() {
		return orgID;
	}

	public void setOrgID(Long orgID) {
		this.orgID = orgID;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	

	public String getOrgAddress() {
		return orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getNums() {
		return nums;
	}

	public void setNums(int nums) {
		this.nums = nums;
	}

	public List<SOrderGoodStatic> getGoodsAmount() {
		return goodsAmount;
	}

	public void setGoodsAmount(List<SOrderGoodStatic> goodsAmount) {
		this.goodsAmount = goodsAmount;
	}

	@Override
	public String toString() {
		return "SaleOrderStatic [orgID=" + orgID + ", orgName=" + orgName + ", orgAddress=" + orgAddress + ", amount="
				+ amount + ", nums=" + nums + ", goodsAmount=" + goodsAmount + "]";
	}

}
