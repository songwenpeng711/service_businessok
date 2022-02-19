package com.kingdee.songwp.businessok.bean;

import java.util.Date;
import java.util.List;

public class SalePolicy {
	
	//政策id
	private Integer fID; 
	//政策名称
	private String fName;
	//销售政策类型 1-数量 2-价钱 3-数量或价钱 4-数量并且价钱
	private int fSaleType;
	//销售总数量
	private float fSumQty;
	//销售总金额
	private float fSumAmount;
	//政策起始时间
	private Date fStartDate;
	//政策结束时间
	private Date fEndDate;
	//是否套装
	private int fSuit;
	//是否倍增
	private int fMultiple;
	//是否可更改单位
	private int fLessSale;
	//商品列表
	private List<SalePolicyGoods> goodsList;
	//赠品列表
	private List<SalePolicyPro> proList;
	
	public SalePolicy() {
		super();
	}
	public SalePolicy(Integer fID, String fName, int fSaleType, float fSumQty, float fSumAmount, Date fStartDate,
			Date fEndDate, int fSuit, int fMultiple) {
		super();
		this.fID = fID;
		this.fName = fName;
		this.fSaleType = fSaleType;
		this.fSumQty = fSumQty;
		this.fSumAmount = fSumAmount;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
		this.fSuit = fSuit;
		this.fMultiple = fMultiple;
	}
	public Integer getfID() {
		return fID;
	}
	public void setfID(Integer fID) {
		this.fID = fID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getfSaleType() {
		return fSaleType;
	}
	public void setfSaleType(int fSaleType) {
		this.fSaleType = fSaleType;
	}
	public float getfSumQty() {
		return fSumQty;
	}
	public void setfSumQty(float fSumQty) {
		this.fSumQty = fSumQty;
	}
	public float getfSumAmount() {
		return fSumAmount;
	}
	public void setfSumAmount(float fSumAmount) {
		this.fSumAmount = fSumAmount;
	}
	public Date getfStartDate() {
		return fStartDate;
	}
	public void setfStartDate(Date fStartDate) {
		this.fStartDate = fStartDate;
	}
	public Date getfEndDate() {
		return fEndDate;
	}
	public void setfEndDate(Date fEndDate) {
		this.fEndDate = fEndDate;
	}
	public int getfSuit() {
		return fSuit;
	}
	public void setfSuit(int fSuit) {
		this.fSuit = fSuit;
	}
	public int getfMultiple() {
		return fMultiple;
	}
	public void setfMultiple(int fMultiple) {
		this.fMultiple = fMultiple;
	}
	public int getfLessSale() {
		return fLessSale;
	}
	public void setfLessSale(int fLessSale) {
		this.fLessSale = fLessSale;
	}
	public List<SalePolicyGoods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<SalePolicyGoods> goodsList) {
		this.goodsList = goodsList;
	}
	public List<SalePolicyPro> getProList() {
		return proList;
	}
	public void setProList(List<SalePolicyPro> proList) {
		this.proList = proList;
	}
	@Override
	public String toString() {
		return "SalePolicy [fID=" + fID + ", fName=" + fName + ", fSaleType=" + fSaleType + ", fSumQty=" + fSumQty
				+ ", fSumAmount=" + fSumAmount + ", fStartDate=" + fStartDate + ", fEndDate=" + fEndDate + ", fSuit="
				+ fSuit + ", fMultiple=" + fMultiple + ", goodsList=" + goodsList + ", proList=" + proList + "]";
	}
	
	

}
