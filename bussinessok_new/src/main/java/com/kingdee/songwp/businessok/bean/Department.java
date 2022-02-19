package com.kingdee.songwp.businessok.bean;

/**
 * 部门实体bean
 * 
 * @author songwenpeng 20180904
 *
 */
public class Department {

	// 部门ID
	private int fItemID;
	// 部门代码
	private String fNumber;
	// 部门名称
	private String fName;
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

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	
	
	public int getfUserID() {
		return fUserID;
	}

	public void setfUserID(int fUserID) {
		this.fUserID = fUserID;
	}

	@Override
	public String toString() {
		return "Department [fItemID=" + fItemID + ", fNumber=" + fNumber + ", fName=" + fName + ", fUserID=" + fUserID
				+ "]";
	}

	

}
