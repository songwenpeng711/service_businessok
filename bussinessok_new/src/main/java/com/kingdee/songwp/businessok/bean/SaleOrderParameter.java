package com.kingdee.songwp.businessok.bean;

/**
 * 销售订单参数
 * 
 * @author songwenpeng 20180905
 *
 */
public class SaleOrderParameter {

	// 显示客户地址
	private Boolean fCustAddV;
	
	// 显示客户电话
	private Boolean fCustPhoV;
	
	// 显示销售方式
	private Boolean fSaleStyleV;
	
	// 默认销售方式
	private int fSaleStyleD;
	
	// 显示销售范围
	private Boolean fAreaPSV;
	
	// 默认销售范围
	private int fAreaPSD;
	
	// 显示业务员
	private Boolean fEmpV;
	
	// 默认业务员
	private int fEmpD;
	
	// 显示部门
	private Boolean fDeptV;
	
	// 默认部门
	private int fDeptD;
	
	// 显示仓库
	private Boolean fDCStockV;
	
	// 默认仓库
	private int fDCStockD;
	
	// 仓库位置
	private int fStockPosition;
	
	// 显示交货日期
	private Boolean ffetchDayV;
	
	// 建议交货天数
	private int fPlanfetchDay;
	
	// 启用整单搭赠
	private Boolean fWholePro;
	
	// 启用搭赠方案
	private int fPlanPro;
	
	// 显示促销品单价金额
	private Boolean fProAmountV;
	
	// 允许修改单价金额
	private Boolean fChooseAmount;
	
	// 允许选择日期
	private Boolean fChooseDate;
	
	// 多选显示方式
	private String fCheckType;
	
	// 单据上传方式
	private String fOnType;
	
	// 不允许修改单据控制方式
	private String fUpdateType;
	
	// 允许删除单据控制方式
	private String fDelType;
	
	// 允许离线下载天数
	private int fOffLineUpDate;
	
	// 允许离线上传天数
	private int fOffLineOnDate;
	
	// 保存后立即打印
	private Boolean fSafePrint;
	
	// 显示打印次数
	private int fPrintCountV;
	
	// 打印联数
	private String fPrintSame;
	
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

	

	public Boolean getfCustAddV() {
		return fCustAddV;
	}



	public void setfCustAddV(Boolean fCustAddV) {
		this.fCustAddV = fCustAddV;
	}



	public Boolean getfCustPhoV() {
		return fCustPhoV;
	}



	public void setfCustPhoV(Boolean fCustPhoV) {
		this.fCustPhoV = fCustPhoV;
	}



	public Boolean getfSaleStyleV() {
		return fSaleStyleV;
	}



	public void setfSaleStyleV(Boolean fSaleStyleV) {
		this.fSaleStyleV = fSaleStyleV;
	}



	public int getfSaleStyleD() {
		return fSaleStyleD;
	}



	public void setfSaleStyleD(int fSaleStyleD) {
		this.fSaleStyleD = fSaleStyleD;
	}



	public Boolean getfAreaPSV() {
		return fAreaPSV;
	}



	public void setfAreaPSV(Boolean fAreaPSV) {
		this.fAreaPSV = fAreaPSV;
	}



	public int getfAreaPSD() {
		return fAreaPSD;
	}



	public void setfAreaPSD(int fAreaPSD) {
		this.fAreaPSD = fAreaPSD;
	}



	public Boolean getfEmpV() {
		return fEmpV;
	}



	public void setfEmpV(Boolean fEmpV) {
		this.fEmpV = fEmpV;
	}



	public int getfEmpD() {
		return fEmpD;
	}



	public void setfEmpD(int fEmpD) {
		this.fEmpD = fEmpD;
	}



	public Boolean getfDeptV() {
		return fDeptV;
	}



	public void setfDeptV(Boolean fDeptV) {
		this.fDeptV = fDeptV;
	}



	public int getfDeptD() {
		return fDeptD;
	}



	public void setfDeptD(int fDeptD) {
		this.fDeptD = fDeptD;
	}



	public Boolean getfDCStockV() {
		return fDCStockV;
	}



	public void setfDCStockV(Boolean fDCStockV) {
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



	public Boolean getFfetchDayV() {
		return ffetchDayV;
	}



	public void setFfetchDayV(Boolean ffetchDayV) {
		this.ffetchDayV = ffetchDayV;
	}



	public int getfPlanfetchDay() {
		return fPlanfetchDay;
	}



	public void setfPlanfetchDay(int fPlanfetchDay) {
		this.fPlanfetchDay = fPlanfetchDay;
	}



	public Boolean getfWholePro() {
		return fWholePro;
	}



	public void setfWholePro(Boolean fWholePro) {
		this.fWholePro = fWholePro;
	}



	public int getfPlanPro() {
		return fPlanPro;
	}



	public void setfPlanPro(int fPlanPro) {
		this.fPlanPro = fPlanPro;
	}



	public Boolean getfProAmountV() {
		return fProAmountV;
	}



	public void setfProAmountV(Boolean fProAmountV) {
		this.fProAmountV = fProAmountV;
	}



	public Boolean getfChooseAmount() {
		return fChooseAmount;
	}



	public void setfChooseAmount(Boolean fChooseAmount) {
		this.fChooseAmount = fChooseAmount;
	}



	public Boolean getfChooseDate() {
		return fChooseDate;
	}



	public void setfChooseDate(Boolean fChooseDate) {
		this.fChooseDate = fChooseDate;
	}



	public String getfCheckType() {
		return fCheckType;
	}



	public void setfCheckType(String fCheckType) {
		this.fCheckType = fCheckType;
	}



	public String getfOnType() {
		return fOnType;
	}



	public void setfOnType(String fOnType) {
		this.fOnType = fOnType;
	}



	public String getfUpdateType() {
		return fUpdateType;
	}



	public void setfUpdateType(String fUpdateType) {
		this.fUpdateType = fUpdateType;
	}



	public String getfDelType() {
		return fDelType;
	}



	public void setfDelType(String fDelType) {
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



	public Boolean getfSafePrint() {
		return fSafePrint;
	}



	public void setfSafePrint(Boolean fSafePrint) {
		this.fSafePrint = fSafePrint;
	}



	public int getfPrintCountV() {
		return fPrintCountV;
	}



	public void setfPrintCountV(int fPrintCountV) {
		this.fPrintCountV = fPrintCountV;
	}



	public String getfPrintSame() {
		return fPrintSame;
	}



	public void setfPrintSame(String fPrintSame) {
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
		return "SaleOrderParameter [fCustAddV=" + fCustAddV + ", fCustPhoV=" + fCustPhoV + ", fSaleStyleV="
				+ fSaleStyleV + ", fSaleStyleD=" + fSaleStyleD + ", fAreaPSV=" + fAreaPSV + ", fAreaPSD=" + fAreaPSD
				+ ", fEmpV=" + fEmpV + ", fEmpD=" + fEmpD + ", fDeptV=" + fDeptV + ", fDeptD=" + fDeptD + ", fDCStockV="
				+ fDCStockV + ", fDCStockD=" + fDCStockD + ", fStockPosition=" + fStockPosition + ", ffetchDayV="
				+ ffetchDayV + ", fPlanfetchDay=" + fPlanfetchDay + ", fWholePro=" + fWholePro + ", fPlanPro="
				+ fPlanPro + ", fProAmountV=" + fProAmountV + ", fChooseAmount=" + fChooseAmount + ", fChooseDate="
				+ fChooseDate + ", fCheckType=" + fCheckType + ", fOnType=" + fOnType + ", fUpdateType=" + fUpdateType
				+ ", fDelType=" + fDelType + ", fOffLineUpDate=" + fOffLineUpDate + ", fOffLineOnDate=" + fOffLineOnDate
				+ ", fSafePrint=" + fSafePrint + ", fPrintCountV=" + fPrintCountV + ", fPrintSame=" + fPrintSame
				+ ", fTitle1=" + fTitle1 + ", fTitle2=" + fTitle2 + ", fHeader1=" + fHeader1 + ", fHeader2=" + fHeader2
				+ ", fHeader3=" + fHeader3 + ", fHeader4=" + fHeader4 + ", fHeader5=" + fHeader5 + ", fHeader6="
				+ fHeader6 + ", ffooter1=" + ffooter1 + ", ffooter2=" + ffooter2 + ", ffooter3=" + ffooter3
				+ ", ffooter4=" + ffooter4 + ", ffooter5=" + ffooter5 + "]";
	}

    
	
}
