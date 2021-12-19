package com.xworkz.linkedlistprac.dto;

public class SoftwareDTO {

	private int softwareId;
	private String softwareName;
	private int softwareSize;
	private boolean isInternetRequired;

	public SoftwareDTO(int softwareId, String softwareName, int softwareSize, boolean isInternetRequired) {
		super();
		this.softwareId = softwareId;
		this.softwareName = softwareName;
		this.softwareSize = softwareSize;
		this.isInternetRequired = isInternetRequired;
	}

	public int getSoftwareId() {
		return softwareId;
	}

	public void setSoftwareId(int softwareId) {
		this.softwareId = softwareId;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public int getSoftwareSize() {
		return softwareSize;
	}

	public void setSoftwareSize(int softwareSize) {
		this.softwareSize = softwareSize;
	}

	public boolean isInternetRequired() {
		return isInternetRequired;
	}

	public void setInternetRequired(boolean isInternetRequired) {
		this.isInternetRequired = isInternetRequired;
	}

	@Override
	public String toString() {
		return "Software - [softwareId = " + softwareId + ", softwareName = " + softwareName + ", softwareSize = "
				+ softwareSize + ", isInternetRequired = " + isInternetRequired + "]";
	}

	@Override
	public int hashCode() {
		return softwareId;
	}
}
