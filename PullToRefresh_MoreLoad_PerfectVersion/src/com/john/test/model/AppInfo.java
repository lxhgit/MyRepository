package com.john.test.model;

import android.graphics.Bitmap;

public class AppInfo{
	private Bitmap appIcon;
	private String appName;
	private String appVer;
	private String appSize;
	private boolean isOpening;	//记录当前item的 展开状态
	
	public boolean isOpening() {
		return isOpening;
	}
	public void setOpening(boolean isOpening) {
		this.isOpening = isOpening;
	}
	public Bitmap getAppIcon() {
		return appIcon;
	}
	public void setAppIcon(Bitmap appIcon) {
		this.appIcon = appIcon;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppVer() {
		return appVer;
	}
	public void setAppVer(String appVer) {
		this.appVer = appVer;
	}
	public String getAppSize() {
		return appSize;
	}
	public void setAppSize(String appSize) {
		this.appSize = appSize;
	}
}
