package com.heroku.model;

public class Heroku {

	private String appName;
	private String language;
	private String requestCreatedTime;

	public Heroku() {
	}

	public Heroku(String appName, String language, String requestCreatedTime) {
		super();
		this.appName = appName;
		this.language = language;
		this.requestCreatedTime = requestCreatedTime;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRequestCreatedTime() {
		return requestCreatedTime;
	}

	public void setRequestCreatedTime(String requestCreatedTime) {
		this.requestCreatedTime = requestCreatedTime;
	}

	@Override
	public String toString() {
		return "Heroku [appName=" + appName + ", language=" + language + ", requestCreatedTime=" + requestCreatedTime
				+ "]";
	}

}
