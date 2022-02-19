package com.kingdee.songwp.businessok.bean;

import java.util.Date;

/**
 * 促销政策实体bean
 * 
 * @author songwenpeng 20180904
 *
 */
public class SalePly {

	// 销售策略ID
	private int fID;
	// 方案名称
	private String fName;
	// 方案日期
	private Date fDate;
	// 促销方式
	private int fSaleType;
	// 销售数量
	private float fSumQty;
	// 销售金额
	private float fSumAmount;
	// 生效日期
	private Date fStarDate;
	// 失效日期
	private Date fEndDate;
	// 套装组合
	private int fSuit;
	// 是否倍数搭赠
	private int fMultiple;
	// 行号
	private int fIndex;
	// 销售商品
	private int fSaleItem;
	// 销售商品单位
	private int fSaleUnit;
	// 销售数量
	private float fSaleQty;
	// 销售价格
	private float fSaleAmount;
	// 赠品名称
	private int fProItem;
	// 赠品单位
	private int fProUnit;
	// 赠品数量
	private float fProQty;
	// 赠品价格
	private float fProAmount;

	public int getfID() {
		return fID;
	}

	public void setfID(int fID) {
		this.fID = fID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Date getfDate() {
		return fDate;
	}

	public void setfDate(Date fDate) {
		this.fDate = fDate;
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

	public Date getfStarDate() {
		return fStarDate;
	}

	public void setfStarDate(Date fStarDate) {
		this.fStarDate = fStarDate;
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

	public int getfIndex() {
		return fIndex;
	}

	public void setfIndex(int fIndex) {
		this.fIndex = fIndex;
	}

	public int getfSaleItem() {
		return fSaleItem;
	}

	public void setfSaleItem(int fSaleItem) {
		this.fSaleItem = fSaleItem;
	}

	public int getfSaleUnit() {
		return fSaleUnit;
	}

	public void setfSaleUnit(int fSaleUnit) {
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

	public int getfProItem() {
		return fProItem;
	}

	public void setfProItem(int fProItem) {
		this.fProItem = fProItem;
	}

	public int getfProUnit() {
		return fProUnit;
	}

	public void setfProUnit(int fProUnit) {
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
		return "SalePly [fID=" + fID + ", fName=" + fName + ", fDate=" + fDate + ", fSaleType=" + fSaleType
				+ ", fSumQty=" + fSumQty + ", fSumAmount=" + fSumAmount + ", fStarDate=" + fStarDate + ", fEndDate="
				+ fEndDate + ", fSuit=" + fSuit + ", fMultiple=" + fMultiple + ", fIndex=" + fIndex + ", fSaleItem="
				+ fSaleItem + ", fSaleUnit=" + fSaleUnit + ", fSaleQty=" + fSaleQty + ", fSaleAmount=" + fSaleAmount
				+ ", fProItem=" + fProItem + ", fProUnit=" + fProUnit + ", fProQty=" + fProQty + ", fProAmount="
				+ fProAmount + "]";
	}

}
