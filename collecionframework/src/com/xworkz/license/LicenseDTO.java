package com.xworkz.license;

public class LicenseDTO {

	private int licenseId;
	private String softwarename;
	private double softwareVersion;
	private String softwareType;
	private double softwareSize;

	public LicenseDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(int licenseId) {
		this.licenseId = licenseId;
	}

	public String getSoftwarename() {
		return softwarename;
	}

	public void setSoftwarename(String softwarename) {
		this.softwarename = softwarename;
	}

	public double getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(double softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public String getSoftwareType() {
		return softwareType;
	}

	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}

	public double getSoftwareSize() {
		return softwareSize;
	}

	public void setSoftwareSize(double softwareSize) {
		this.softwareSize = softwareSize;
	}

}
