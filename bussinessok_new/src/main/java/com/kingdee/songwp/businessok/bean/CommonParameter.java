package com.kingdee.songwp.businessok.bean;

/**
 * 公共参数实体bean
 * 
 * @author songwenpeng 20180905
 *
 */
public class CommonParameter {

	// 公司名称
	private String fCompanyName;
	// 仅WIFI环境上传下载
	private int fIsWifi;
	// 允许上传设置参数
	private int fIsSystem;
	// 系统自动登录
	private int fAutoLanding;
	// 服务器地址
	private String fServerIP;
	// 启用通知
	private int fnotice;
	// 手机IMEI
	private String fImei;
	// 注册码
	private String fCodeID;
	// 软件版本
	private String fVersion;
	// 标题字号
	private int fTitleSize;
	// 表体字号
	private int fEntrySize;
	// 页眉字号
	private int fHeaderSize;
	// 页脚字号
	private int ffooterSize;

	public String getfCompanyName() {
		return fCompanyName;
	}

	public void setfCompanyName(String fCompanyName) {
		this.fCompanyName = fCompanyName;
	}

	public int getfIsWifi() {
		return fIsWifi;
	}

	public void setfIsWifi(int fIsWifi) {
		this.fIsWifi = fIsWifi;
	}

	public int getfIsSystem() {
		return fIsSystem;
	}

	public void setfIsSystem(int fIsSystem) {
		this.fIsSystem = fIsSystem;
	}

	public int getfAutoLanding() {
		return fAutoLanding;
	}

	public void setfAutoLanding(int fAutoLanding) {
		this.fAutoLanding = fAutoLanding;
	}

	public String getfServerIP() {
		return fServerIP;
	}

	public void setfServerIP(String fServerIP) {
		this.fServerIP = fServerIP;
	}

	public int getFnotice() {
		return fnotice;
	}

	public void setFnotice(int fnotice) {
		this.fnotice = fnotice;
	}

	public String getfImei() {
		return fImei;
	}

	public void setfImei(String fImei) {
		this.fImei = fImei;
	}

	public String getfCodeID() {
		return fCodeID;
	}

	public void setfCodeID(String fCodeID) {
		this.fCodeID = fCodeID;
	}

	public String getfVersion() {
		return fVersion;
	}

	public void setfVersion(String fVersion) {
		this.fVersion = fVersion;
	}

	public int getfTitleSize() {
		return fTitleSize;
	}

	public void setfTitleSize(int fTitleSize) {
		this.fTitleSize = fTitleSize;
	}

	public int getfEntrySize() {
		return fEntrySize;
	}

	public void setfEntrySize(int fEntrySize) {
		this.fEntrySize = fEntrySize;
	}

	public int getfHeaderSize() {
		return fHeaderSize;
	}

	public void setfHeaderSize(int fHeaderSize) {
		this.fHeaderSize = fHeaderSize;
	}

	public int getFfooterSize() {
		return ffooterSize;
	}

	public void setFfooterSize(int ffooterSize) {
		this.ffooterSize = ffooterSize;
	}

	@Override
	public String toString() {
		return "CommonParameter [fCompanyName=" + fCompanyName + ", fIsWifi=" + fIsWifi + ", fIsSystem=" + fIsSystem
				+ ", fAutoLanding=" + fAutoLanding + ", fServerIP=" + fServerIP + ", fnotice=" + fnotice + ", fImei="
				+ fImei + ", fCodeID=" + fCodeID + ", fVersion=" + fVersion + ", fTitleSize=" + fTitleSize
				+ ", fEntrySize=" + fEntrySize + ", fHeaderSize=" + fHeaderSize + ", ffooterSize=" + ffooterSize + "]";
	}

}
