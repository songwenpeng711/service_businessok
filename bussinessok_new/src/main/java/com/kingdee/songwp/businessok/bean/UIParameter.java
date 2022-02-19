package com.kingdee.songwp.businessok.bean;

import java.io.Serializable;

/**
 * 界面参数设置实体bean
 * 
 * @author songwenpeng 20180905
 *
 */
public class UIParameter  {

	// 采购申请单
	private Boolean fEntry22;
	// 采购入库单
	private Boolean fEntry23;
	// 采购退货通知
	private Boolean fEntry24;
	// 采购退货单
	private Boolean fEntry25;
	// 采购单查询
	private Boolean fBillCgfilter;
	// 采购汇总表
	private Boolean fBillCgSum;
	// 销售订货单
	private Boolean fEntry26;
	// 销售出库单
	private Boolean fEntry27;
	// 销售退货通知
	private Boolean fEntry28;
	// 销售退货单
	private Boolean fEntry29;
	// 销售单查询
	private Boolean fBillXsfilter;
	// 销售汇总表
	private Boolean fBillXsSum;
	// 销售排行表
	private Boolean fBillXsOrder;
	// 仓库调拔单
	private Boolean fEntry30;
	// 调拔单查询
	private Boolean fBillDbfilter;
	// 即时库存查询
	private Boolean fBillKcfilter;
	
	public UIParameter() {
		
	}
	
	public UIParameter(Boolean fEntry22, Boolean fEntry23, Boolean fEntry24, Boolean fEntry25, Boolean fBillCgfilter,
			Boolean fBillCgSum, Boolean fEntry26, Boolean fEntry27, Boolean fEntry28, Boolean fEntry29,
			Boolean fBillXsfilter, Boolean fBillXsSum, Boolean fBillXsOrder, Boolean fEntry30, Boolean fBillDbfilter,
			Boolean fBillKcfilter) {
		super();
		this.fEntry22 = fEntry22;
		this.fEntry23 = fEntry23;
		this.fEntry24 = fEntry24;
		this.fEntry25 = fEntry25;
		this.fBillCgfilter = fBillCgfilter;
		this.fBillCgSum = fBillCgSum;
		this.fEntry26 = fEntry26;
		this.fEntry27 = fEntry27;
		this.fEntry28 = fEntry28;
		this.fEntry29 = fEntry29;
		this.fBillXsfilter = fBillXsfilter;
		this.fBillXsSum = fBillXsSum;
		this.fBillXsOrder = fBillXsOrder;
		this.fEntry30 = fEntry30;
		this.fBillDbfilter = fBillDbfilter;
		this.fBillKcfilter = fBillKcfilter;
	}

	public Boolean getfEntry22() {
		return fEntry22;
	}

	public void setfEntry22(Boolean fEntry22) {
		this.fEntry22 = fEntry22;
	}

	public Boolean getfEntry23() {
		return fEntry23;
	}

	public void setfEntry23(Boolean fEntry23) {
		this.fEntry23 = fEntry23;
	}

	public Boolean getfEntry24() {
		return fEntry24;
	}

	public void setfEntry24(Boolean fEntry24) {
		this.fEntry24 = fEntry24;
	}

	public Boolean getfEntry25() {
		return fEntry25;
	}

	public void setfEntry25(Boolean fEntry25) {
		this.fEntry25 = fEntry25;
	}

	public Boolean getfBillCgfilter() {
		return fBillCgfilter;
	}

	public void setfBillCgfilter(Boolean fBillCgfilter) {
		this.fBillCgfilter = fBillCgfilter;
	}

	public Boolean getfBillCgSum() {
		return fBillCgSum;
	}

	public void setfBillCgSum(Boolean fBillCgSum) {
		this.fBillCgSum = fBillCgSum;
	}

	public Boolean getfEntry26() {
		return fEntry26;
	}

	public void setfEntry26(Boolean fEntry26) {
		this.fEntry26 = fEntry26;
	}

	public Boolean getfEntry27() {
		return fEntry27;
	}

	public void setfEntry27(Boolean fEntry27) {
		this.fEntry27 = fEntry27;
	}

	public Boolean getfEntry28() {
		return fEntry28;
	}

	public void setfEntry28(Boolean fEntry28) {
		this.fEntry28 = fEntry28;
	}

	public Boolean getfEntry29() {
		return fEntry29;
	}

	public void setfEntry29(Boolean fEntry29) {
		this.fEntry29 = fEntry29;
	}

	public Boolean getfBillXsfilter() {
		return fBillXsfilter;
	}

	public void setfBillXsfilter(Boolean fBillXsfilter) {
		this.fBillXsfilter = fBillXsfilter;
	}

	public Boolean getfBillXsSum() {
		return fBillXsSum;
	}

	public void setfBillXsSum(Boolean fBillXsSum) {
		this.fBillXsSum = fBillXsSum;
	}

	public Boolean getfBillXsOrder() {
		return fBillXsOrder;
	}

	public void setfBillXsOrder(Boolean fBillXsOrder) {
		this.fBillXsOrder = fBillXsOrder;
	}

	public Boolean getfEntry30() {
		return fEntry30;
	}

	public void setfEntry30(Boolean fEntry30) {
		this.fEntry30 = fEntry30;
	}

	public Boolean getfBillDbfilter() {
		return fBillDbfilter;
	}

	public void setfBillDbfilter(Boolean fBillDbfilter) {
		this.fBillDbfilter = fBillDbfilter;
	}

	public Boolean getfBillKcfilter() {
		return fBillKcfilter;
	}

	public void setfBillKcfilter(Boolean fBillKcfilter) {
		this.fBillKcfilter = fBillKcfilter;
	}

	@Override
	public String toString() {
		return "UIParameter [fEntry22=" + fEntry22 + ", fEntry23=" + fEntry23 + ", fEntry24=" + fEntry24 + ", fEntry25="
				+ fEntry25 + ", fBillCgfilter=" + fBillCgfilter + ", fBillCgSum=" + fBillCgSum + ", fEntry26="
				+ fEntry26 + ", fEntry27=" + fEntry27 + ", fEntry28=" + fEntry28 + ", fEntry29=" + fEntry29
				+ ", fBillXsfilter=" + fBillXsfilter + ", fBillXsSum=" + fBillXsSum + ", fBillXsOrder=" + fBillXsOrder
				+ ", fEntry30=" + fEntry30 + ", fBillDbfilter=" + fBillDbfilter + ", fBillKcfilter=" + fBillKcfilter
				+ "]";
	}

}
