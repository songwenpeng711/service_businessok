package com.kingdee.songwp.businessok.bean;

/**
 * 销售客户实体bean
 * 
 * @author songwenpeng 20180904
 *
 */
public class Organization {

	// 客户ID
	private int fItemID;
	// 客户代码
	private String fNumber;
	// 客户名称
	private String FName;
	// 客户助记码
	private String fHelpCode;
	// 联系人
	private String fContact;
	// 地址
	private String fAddress;
	// 电话
	private String fPhone;
	// 手机
	private String fMobilePhone;
	// 销售方式
	private int fSaleID;
	// 客户分类
	private int fTypeID;
	// 经度
	private String fHTLongitude;
	// 纬度
	private String fHTLatitude;
	// 用户ID
	private int fUserID;

	public int getfItemID() {
		return fItemID;
	}

	public void setfItemID(int fItemID) {
		this.fItemID = fItemID;
	}

	public String getfNumber() {
		return fNumber;
	}

	public void setfNumber(String fNumber) {
		this.fNumber = fNumber;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getfHelpCode() {
		return fHelpCode;
	}

	public void setfHelpCode(String fHelpCode) {
		this.fHelpCode = fHelpCode;
	}

	public String getfContact() {
		return fContact;
	}

	public void setfContact(String fContact) {
		this.fContact = fContact;
	}

	public String getfAddress() {
		return fAddress;
	}

	public void setfAddress(String fAddress) {
		this.fAddress = fAddress;
	}

	public String getfPhone() {
		return fPhone;
	}

	public void setfPhone(String fPhone) {
		this.fPhone = fPhone;
	}

	public String getfMobilePhone() {
		return fMobilePhone;
	}

	public void setfMobilePhone(String fMobilePhone) {
		this.fMobilePhone = fMobilePhone;
	}

	public int getfSaleID() {
		return fSaleID;
	}

	public void setfSaleID(int fSaleID) {
		this.fSaleID = fSaleID;
	}

	public int getfTypeID() {
		return fTypeID;
	}

	public void setfTypeID(int fTypeID) {
		this.fTypeID = fTypeID;
	}

	public String getfHTLongitude() {
		return fHTLongitude;
	}

	public void setfHTLongitude(String fHTLongitude) {
		this.fHTLongitude = fHTLongitude;
	}

	public String getfHTLatitude() {
		return fHTLatitude;
	}

	public void setfHTLatitude(String fHTLatitude) {
		this.fHTLatitude = fHTLatitude;
	}

	public int getfUserID() {
		return fUserID;
	}

	public void setfUserID(int fUserID) {
		this.fUserID = fUserID;
	}

	@Override
	public String toString() {
		return "Organization [fItemID=" + fItemID + ", fNumber=" + fNumber + ", FName=" + FName + ", fHelpCode="
				+ fHelpCode + ", fContact=" + fContact + ", fAddress=" + fAddress + ", fPhone=" + fPhone
				+ ", fMobilePhone=" + fMobilePhone + ", fSaleID=" + fSaleID + ", fTypeID=" + fTypeID + ", fHTLongitude="
				+ fHTLongitude + ", fHTLatitude=" + fHTLatitude + ", fUserID=" + fUserID + "]";
	}

	

}
