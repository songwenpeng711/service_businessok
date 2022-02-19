package com.kingdee.songwp.businessok.bean;

/**
 * 仓库实体bean
 * 
 * @author songwenpeng 20180905
 *
 */
public class Stock {
	// 仓库ID
	private int fItemID;
	// 仓库编号
	private String fNumber;
	// 仓库名称
	private String fName;
	// 是否负库存
	private int fUnderStock;
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

	public int getfUnderStock() {
		return fUnderStock;
	}

	public void setfUnderStock(int fUnderStock) {
		this.fUnderStock = fUnderStock;
	}

	public int getfUserID() {
		return fUserID;
	}

	public void setfUserID(int fUserID) {
		this.fUserID = fUserID;
	}

	@Override
	public String toString() {
		return "Stock [fItemID=" + fItemID + ", fNumber=" + fNumber + ", fName=" + fName + ", fUnderStock="
				+ fUnderStock + ", fUserID=" + fUserID + "]";
	}

	

}
