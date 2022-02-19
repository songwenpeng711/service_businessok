package com.kingdee.songwp.businessok.bean;

/**
 * 职员实体bean
 * 
 * @author songwenpeng 20180904
 *
 */
public class Employee {
	// 职员ID
	private int fItemID;
	// 职员代码
	private String fNumber;
	// 职员名称
	private String fName;
	// 职员类别
	private int fEmpGroup;
	// 用户ID
	private int fUserID;
	//客户端登录密码
	private String fClientPwd;
	
	public Employee() {
		
	}

	public Employee(int fItemID, String fNumber, String fName, int fEmpGroup, int fUserID, String password) {
		super();
		this.fItemID = fItemID;
		this.fNumber = fNumber;
		this.fName = fName;
		this.fEmpGroup = fEmpGroup;
		this.fUserID = fUserID;
		this.fClientPwd = password;
	}

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

	public int getfEmpGroup() {
		return fEmpGroup;
	}

	public void setfEmpGroup(int fEmpGroup) {
		this.fEmpGroup = fEmpGroup;
	}

	public int getfUserID() {
		return fUserID;
	}

	public void setfUserID(int fUserID) {
		this.fUserID = fUserID;
	}

	public String getfClientPwd() {
		return fClientPwd;
	}

	public void setfClientPwd(String fClientPwd) {
		this.fClientPwd = fClientPwd;
	}

	@Override
	public String toString() {
		return "Employee [fItemID=" + fItemID + ", fNumber=" + fNumber + ", fName=" + fName + ", fEmpGroup=" + fEmpGroup
				+ ", fUserID=" + fUserID + ", fClientPwd=" + fClientPwd + "]";
	}

}
