package com.test1;

public class ApiGatewayAuthenticatorJob {
	private Integer oauthControlId;
	private String oauthControlName;
	private String oauthControlRegistry;
	private String oauthControlStartTime;
	private String oauthControlApprovedTime;
	private String oauthControlOwner;
	private boolean authorizedDevice;
	private String timeOutInSeconds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ApiGatewayAuthenticatorJob() {

	}

	public ApiGatewayAuthenticatorJob(Integer oauthControlId, String oauthControlName, String oauthControlRegistry,
			String oauthControlStartTime, String oauthControlApprovedTime, String oauthControlOwner,
			boolean authorizedDevice, String timeOutInSeconds, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.oauthControlId = oauthControlId;
		this.oauthControlName = oauthControlName;
		this.oauthControlRegistry = oauthControlRegistry;
		this.oauthControlStartTime = oauthControlStartTime;
		this.oauthControlApprovedTime = oauthControlApprovedTime;
		this.oauthControlOwner = oauthControlOwner;
		this.authorizedDevice = authorizedDevice;
		this.timeOutInSeconds = timeOutInSeconds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getOauthControlId() {
		return oauthControlId;
	}

	public void setOauthControlId(Integer oauthControlId) {
		this.oauthControlId = oauthControlId;
	}

	public String getOauthControlName() {
		return oauthControlName;
	}

	public void setOauthControlName(String oauthControlName) {
		this.oauthControlName = oauthControlName;
	}

	public String getOauthControlRegistry() {
		return oauthControlRegistry;
	}

	public void setOauthControlRegistry(String oauthControlRegistry) {
		this.oauthControlRegistry = oauthControlRegistry;
	}

	public String getOauthControlStartTime() {
		return oauthControlStartTime;
	}

	public void setOauthControlStartTime(String oauthControlStartTime) {
		this.oauthControlStartTime = oauthControlStartTime;
	}

	public String getOauthControlApprovedTime() {
		return oauthControlApprovedTime;
	}

	public void setOauthControlApprovedTime(String oauthControlApprovedTime) {
		this.oauthControlApprovedTime = oauthControlApprovedTime;
	}

	public String getOauthControlOwner() {
		return oauthControlOwner;
	}

	public void setOauthControlOwner(String oauthControlOwner) {
		this.oauthControlOwner = oauthControlOwner;
	}

	public boolean isAuthorizedDevice() {
		return authorizedDevice;
	}

	public void setAuthorizedDevice(boolean authorizedDevice) {
		this.authorizedDevice = authorizedDevice;
	}

	public String getTimeOutInSeconds() {
		return timeOutInSeconds;
	}

	public void setTimeOutInSeconds(String timeOutInSeconds) {
		this.timeOutInSeconds = timeOutInSeconds;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}