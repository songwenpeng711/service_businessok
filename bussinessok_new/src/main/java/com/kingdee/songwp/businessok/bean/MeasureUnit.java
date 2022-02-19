package com.kingdee.songwp.businessok.bean;

/**
 * 计量单位实体bean
 * 
 * @author songwenpeng 20180905
 *
 */
public class MeasureUnit {

	// 计量单位ID
	private int fMeasureUnitID;
	// 计量单位编号
	private String fNumber;
	// 计量单位名称
	private String fUnitName;
	// 换算率
	private int fCoefficient;
	// 计量组单位ID
	private int fUnitGroupID;
	// 计量组名称
	private String fGroupName;
	// 计量组默认单位
	private int fDefaultUnitID;

	public int getfMeasureUnitID() {
		return fMeasureUnitID;
	}

	public void setfMeasureUnitID(int fMeasureUnitID) {
		this.fMeasureUnitID = fMeasureUnitID;
	}

	public String getfNumber() {
		return fNumber;
	}

	public void setfNumber(String fNumber) {
		this.fNumber = fNumber;
	}

	public String getfUnitName() {
		return fUnitName;
	}

	public void setfUnitName(String fUnitName) {
		this.fUnitName = fUnitName;
	}

	public int getfCoefficient() {
		return fCoefficient;
	}

	public void setfCoefficient(int fCoefficient) {
		this.fCoefficient = fCoefficient;
	}

	public int getfUnitGroupID() {
		return fUnitGroupID;
	}

	public void setfUnitGroupID(int fUnitGroupID) {
		this.fUnitGroupID = fUnitGroupID;
	}

	public String getfGroupName() {
		return fGroupName;
	}

	public void setfGroupName(String fGroupName) {
		this.fGroupName = fGroupName;
	}

	public int getfDefaultUnitID() {
		return fDefaultUnitID;
	}

	public void setfDefaultUnitID(int fDefaultUnitID) {
		this.fDefaultUnitID = fDefaultUnitID;
	}

	@Override
	public String toString() {
		return "MeasureUnit [fMeasureUnitID=" + fMeasureUnitID + ", fNumber=" + fNumber + ", fUnitName=" + fUnitName
				+ ", fCoefficeient=" + fCoefficient + ", fUnitGroupID=" + fUnitGroupID + ", fGroupName=" + fGroupName
				+ ", fDefaultUnitID=" + fDefaultUnitID + "]";
	}

}
