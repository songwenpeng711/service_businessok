package com.kingdee.songwp.businessok.bean;

import java.util.Date;

/**
 * 价格政策实体bean
 * 
 * @author songwenpeng 20180905
 *
 */
public class PricePly {

	// 价格政策ID
	private int fInterID;
	// 价格政策编号
	private String fNumber;
	// 价格政策名称
	private String fName;
	// 优先级
	private int fPri;
	// 组合类型
	private String fPlyType;
	// 类别ID
	private int fSysTypeID;
	// 政策关联客户类型ID
	private int fRelatedID;
	// 政策生效起始时间
	private Date fBegDate;
	// 政策生效结束时间
	private Date fEndDate;
	// 商品ID
	private int fItemID;
	// 商品单位ID
	private int fUnitID;
	// 销售量（从）
	private float fBegQty;
	// 销售量 (到）
	private float fEndQty;
	// 销售价格
	private float fprice;

	public int getfInterID() {
		return fInterID;
	}

	public void setfInterID(int fInterID) {
		this.fInterID = fInterID;
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

	public int getfPri() {
		return fPri;
	}

	public void setfPri(int fPri) {
		this.fPri = fPri;
	}

	public String getfPlyType() {
		return fPlyType;
	}

	public void setfPlyType(String fPlyType) {
		this.fPlyType = fPlyType;
	}

	public int getfSysTypeID() {
		return fSysTypeID;
	}

	public void setfSysTypeID(int fSysTypeID) {
		this.fSysTypeID = fSysTypeID;
	}

	public Date getfBegDate() {
		return fBegDate;
	}

	public void setfBegDate(Date fBegDate) {
		this.fBegDate = fBegDate;
	}

	public Date getfEndDate() {
		return fEndDate;
	}

	public void setfEndDate(Date fEndDate) {
		this.fEndDate = fEndDate;
	}

	public int getfItemID() {
		return fItemID;
	}

	public void setfItemID(int fItemID) {
		this.fItemID = fItemID;
	}

	public int getfUnitID() {
		return fUnitID;
	}

	public void setfUnitID(int fUnitID) {
		this.fUnitID = fUnitID;
	}

	public float getfBegQty() {
		return fBegQty;
	}

	public void setfBegQty(float fBegQty) {
		this.fBegQty = fBegQty;
	}

	public float getfEndQty() {
		return fEndQty;
	}

	public void setfEndQty(float fEndQty) {
		this.fEndQty = fEndQty;
	}

	public float getFprice() {
		return fprice;
	}

	public void setFprice(float fprice) {
		this.fprice = fprice;
	}

	
	public int getfRelatedID() {
		return fRelatedID;
	}

	public void setfRelatedID(int fRelatedID) {
		this.fRelatedID = fRelatedID;
	}

	@Override
	public String toString() {
		return "PricePly [fInterID=" + fInterID + ", fNumber=" + fNumber + ", fName=" + fName + ", fPri=" + fPri
				+ ", fPlyType=" + fPlyType + ", fSysTypeID=" + fSysTypeID + ", fBegDate=" + fBegDate + ", fEndDate="
				+ fEndDate + ", fItemID=" + fItemID + ", fUnitID=" + fUnitID + ", fBegQty=" + fBegQty + ", fEndQty="
				+ fEndQty + ", fprice=" + fprice + "]";
	}

}
