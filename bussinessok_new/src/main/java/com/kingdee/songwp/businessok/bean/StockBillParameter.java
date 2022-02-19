package com.kingdee.songwp.businessok.bean;

/**
 * 销售出库单实体bean
 * 
 * @author songwenpeng 20180905
 *
 */
public class StockBillParameter {

	// 显示客户地址

	private int fCustAddV;
	// 显示客户电话

	private int fCustPhoV;
	// 显示销售方式

	private int fSaleStyleV;
	// 默认销售方式

	private int fSaleStyleD;
	// 显示业务类型

	private int fBizTypeV;
	// 默认业务类型

	private int fBizTypeD;
	// 显示业务员

	private int fEmpV;
	// 默认业务员

	private int fEmpD;
	// 显示部门

	private int fDeptV;
	// 默认部门

	private int fDeptD;
	// 显示仓库

	private int fDCStockV;
	// 默认仓库

	private int fDCStockD;
	// 仓库位置

	private int fStockPosition;
	// 启用批号

	private int fBatchNo;
	// 显示选择订单
	private int fBillInterV;
	// 必须关联销售订单

	private int fBillInterM;
	// 关联后强制关闭销售订单

	private int fBillInterC;
	// 送货差异自动生成退货通知

	private int fBillAuto;
	// 启用整单搭赠

	private int fWholePro;
	// 启用搭赠方案

	private int fPlanPro;
	// 显示促销品单价金额

	private int fProAmountV;
	// 允许修改单价金额

	private int fChooseAmount;
	// 允许选择日期

	private int fChooseDate;
	// 多选显示方式

	private int fCheckType;
	// 单据上传方式

	private int fOnType;
	// 不允许修改单据控制方式

	private int fUpdateType;
	// 允许删除单据控制方式

	private int fDelType;
	// 允许离线下载天数

	private int fOffLineUpDate;
	// 允许离线上传天数

	private int fOffLineOnDate;
	// 保存后立即打印

	private int fSafePrint;
	// 显示打印次数

	private int fPrintCountV;
	// 打印联数
	private int fPrintSame;
	// 标题1

	private String fTitle1;
	// 标题2

	private String fTitle2;
	// 页眉1

	private String fHeader1;
	// 页眉2

	private String fHeader2;
	// 页眉3

	private String fHeader3;
	// 页眉4

	private String fHeader4;
	// 页眉5

	private String fHeader5;
	// 页眉6

	private String fHeader6;
	// 页脚1

	private String ffooter1;
	// 页脚2

	private String ffooter2;
	// 页脚3

	private String ffooter3;
	// 页脚4

	private String ffooter4;
	// 页脚5
	private String ffooter5;

	public int getfCustAddV() {
		return fCustAddV;
	}

	public void setfCustAddV(int fCustAddV) {
		this.fCustAddV = fCustAddV;
	}

	public int getfCustPhoV() {
		return fCustPhoV;
	}

	public void setfCustPhoV(int fCustPhoV) {
		this.fCustPhoV = fCustPhoV;
	}

	public int getfSaleStyleV() {
		return fSaleStyleV;
	}

	public void setfSaleStyleV(int fSaleStyleV) {
		this.fSaleStyleV = fSaleStyleV;
	}

	public int getfSaleStyleD() {
		return fSaleStyleD;
	}

	public void setfSaleStyleD(int fSaleStyleD) {
		this.fSaleStyleD = fSaleStyleD;
	}

	public int getfBizTypeV() {
		return fBizTypeV;
	}

	public void setfBizTypeV(int fBizTypeV) {
		this.fBizTypeV = fBizTypeV;
	}

	public int getfBizTypeD() {
		return fBizTypeD;
	}

	public void setfBizTypeD(int fBizTypeD) {
		this.fBizTypeD = fBizTypeD;
	}

	public int getfEmpV() {
		return fEmpV;
	}

	public void setfEmpV(int fEmpV) {
		this.fEmpV = fEmpV;
	}

	public int getfEmpD() {
		return fEmpD;
	}

	public void setfEmpD(int fEmpD) {
		this.fEmpD = fEmpD;
	}

	public int getfDeptV() {
		return fDeptV;
	}

	public void setfDeptV(int fDeptV) {
		this.fDeptV = fDeptV;
	}

	public int getfDeptD() {
		return fDeptD;
	}

	public void setfDeptD(int fDeptD) {
		this.fDeptD = fDeptD;
	}

	public int getfDCStockV() {
		return fDCStockV;
	}

	public void setfDCStockV(int fDCStockV) {
		this.fDCStockV = fDCStockV;
	}

	public int getfDCStockD() {
		return fDCStockD;
	}

	public void setfDCStockD(int fDCStockD) {
		this.fDCStockD = fDCStockD;
	}

	public int getfStockPosition() {
		return fStockPosition;
	}

	public void setfStockPosition(int fStockPosition) {
		this.fStockPosition = fStockPosition;
	}

	public int getfBatchNo() {
		return fBatchNo;
	}

	public void setfBatchNo(int fBatchNo) {
		this.fBatchNo = fBatchNo;
	}

	public int getfBillInterV() {
		return fBillInterV;
	}

	public void setfBillInterV(int fBillInterV) {
		this.fBillInterV = fBillInterV;
	}

	public int getfBillInterM() {
		return fBillInterM;
	}

	public void setfBillInterM(int fBillInterM) {
		this.fBillInterM = fBillInterM;
	}

	public int getfBillInterC() {
		return fBillInterC;
	}

	public void setfBillInterC(int fBillInterC) {
		this.fBillInterC = fBillInterC;
	}

	public int getfBillAuto() {
		return fBillAuto;
	}

	public void setfBillAuto(int fBillAuto) {
		this.fBillAuto = fBillAuto;
	}

	public int getfWholePro() {
		return fWholePro;
	}

	public void setfWholePro(int fWholePro) {
		this.fWholePro = fWholePro;
	}

	public int getfPlanPro() {
		return fPlanPro;
	}

	public void setfPlanPro(int fPlanPro) {
		this.fPlanPro = fPlanPro;
	}

	public int getfProAmountV() {
		return fProAmountV;
	}

	public void setfProAmountV(int fProAmountV) {
		this.fProAmountV = fProAmountV;
	}

	public int getfChooseAmount() {
		return fChooseAmount;
	}

	public void setfChooseAmount(int fChooseAmount) {
		this.fChooseAmount = fChooseAmount;
	}

	public int getfChooseDate() {
		return fChooseDate;
	}

	public void setfChooseDate(int fChooseDate) {
		this.fChooseDate = fChooseDate;
	}

	public int getfCheckType() {
		return fCheckType;
	}

	public void setfCheckType(int fCheckType) {
		this.fCheckType = fCheckType;
	}

	public int getfOnType() {
		return fOnType;
	}

	public void setfOnType(int fOnType) {
		this.fOnType = fOnType;
	}

	public int getfUpdateType() {
		return fUpdateType;
	}

	public void setfUpdateType(int fUpdateType) {
		this.fUpdateType = fUpdateType;
	}

	public int getfDelType() {
		return fDelType;
	}

	public void setfDelType(int fDelType) {
		this.fDelType = fDelType;
	}

	public int getfOffLineUpDate() {
		return fOffLineUpDate;
	}

	public void setfOffLineUpDate(int fOffLineUpDate) {
		this.fOffLineUpDate = fOffLineUpDate;
	}

	public int getfOffLineOnDate() {
		return fOffLineOnDate;
	}

	public void setfOffLineOnDate(int fOffLineOnDate) {
		this.fOffLineOnDate = fOffLineOnDate;
	}

	public int getfSafePrint() {
		return fSafePrint;
	}

	public void setfSafePrint(int fSafePrint) {
		this.fSafePrint = fSafePrint;
	}

	public int getfPrintCountV() {
		return fPrintCountV;
	}

	public void setfPrintCountV(int fPrintCountV) {
		this.fPrintCountV = fPrintCountV;
	}

	public int getfPrintSame() {
		return fPrintSame;
	}

	public void setfPrintSame(int fPrintSame) {
		this.fPrintSame = fPrintSame;
	}

	public String getfTitle1() {
		return fTitle1;
	}

	public void setfTitle1(String fTitle1) {
		this.fTitle1 = fTitle1;
	}

	public String getfTitle2() {
		return fTitle2;
	}

	public void setfTitle2(String fTitle2) {
		this.fTitle2 = fTitle2;
	}

	public String getfHeader1() {
		return fHeader1;
	}

	public void setfHeader1(String fHeader1) {
		this.fHeader1 = fHeader1;
	}

	public String getfHeader2() {
		return fHeader2;
	}

	public void setfHeader2(String fHeader2) {
		this.fHeader2 = fHeader2;
	}

	public String getfHeader3() {
		return fHeader3;
	}

	public void setfHeader3(String fHeader3) {
		this.fHeader3 = fHeader3;
	}

	public String getfHeader4() {
		return fHeader4;
	}

	public void setfHeader4(String fHeader4) {
		this.fHeader4 = fHeader4;
	}

	public String getfHeader5() {
		return fHeader5;
	}

	public void setfHeader5(String fHeader5) {
		this.fHeader5 = fHeader5;
	}

	public String getfHeader6() {
		return fHeader6;
	}

	public void setfHeader6(String fHeader6) {
		this.fHeader6 = fHeader6;
	}

	public String getFfooter1() {
		return ffooter1;
	}

	public void setFfooter1(String ffooter1) {
		this.ffooter1 = ffooter1;
	}

	public String getFfooter2() {
		return ffooter2;
	}

	public void setFfooter2(String ffooter2) {
		this.ffooter2 = ffooter2;
	}

	public String getFfooter3() {
		return ffooter3;
	}

	public void setFfooter3(String ffooter3) {
		this.ffooter3 = ffooter3;
	}

	public String getFfooter4() {
		return ffooter4;
	}

	public void setFfooter4(String ffooter4) {
		this.ffooter4 = ffooter4;
	}

	public String getFfooter5() {
		return ffooter5;
	}

	public void setFfooter5(String ffooter5) {
		this.ffooter5 = ffooter5;
	}

	@Override
	public String toString() {
		return "SaleOutParameter [fCustAddV=" + fCustAddV + ", fCustPhoV=" + fCustPhoV + ", fSaleStyleV=" + fSaleStyleV
				+ ", fSaleStyleD=" + fSaleStyleD + ", fBizTypeV=" + fBizTypeV + ", fBizTypeD=" + fBizTypeD + ", fEmpV="
				+ fEmpV + ", fEmpD=" + fEmpD + ", fDeptV=" + fDeptV + ", fDeptD=" + fDeptD + ", fDCStockV=" + fDCStockV
				+ ", fDCStockD=" + fDCStockD + ", fStockPosition=" + fStockPosition + ", fBatchNo=" + fBatchNo
				+ ", fBillInterV=" + fBillInterV + ", fBillInterM=" + fBillInterM + ", fBillInterC=" + fBillInterC
				+ ", fBillAuto=" + fBillAuto + ", fWholePro=" + fWholePro + ", fPlanPro=" + fPlanPro + ", fProAmountV="
				+ fProAmountV + ", fChooseAmount=" + fChooseAmount + ", fChooseDate=" + fChooseDate + ", fCheckType="
				+ fCheckType + ", fOnType=" + fOnType + ", fUpdateType=" + fUpdateType + ", fDelType=" + fDelType
				+ ", fOffLineUpDate=" + fOffLineUpDate + ", fOffLineOnDate=" + fOffLineOnDate + ", fSafePrint="
				+ fSafePrint + ", fPrintCountV=" + fPrintCountV + ", fPrintSame=" + fPrintSame + ", fTitle1=" + fTitle1
				+ ", fTitle2=" + fTitle2 + ", fHeader1=" + fHeader1 + ", fHeader2=" + fHeader2 + ", fHeader3="
				+ fHeader3 + ", fHeader4=" + fHeader4 + ", fHeader5=" + fHeader5 + ", fHeader6=" + fHeader6
				+ ", ffooter1=" + ffooter1 + ", ffooter2=" + ffooter2 + ", ffooter3=" + ffooter3 + ", ffooter4="
				+ ffooter4 + ", ffooter5=" + ffooter5 + "]";
	}

}
