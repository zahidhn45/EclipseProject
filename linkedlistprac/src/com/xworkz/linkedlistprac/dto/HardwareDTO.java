package com.xworkz.linkedlistprac.dto;

public class HardwareDTO {

	private int hardwareId;
	private String hardwareName;
	private double hardwarePrice;
	private String hardwareType;

	public HardwareDTO(int hardwareId, String hardwareName, double hardwarePrice, String hardwareType) {
		super();
		this.hardwareId = hardwareId;
		this.hardwareName = hardwareName;
		this.hardwarePrice = hardwarePrice;
		this.hardwareType = hardwareType;
	}

	public int getHardwareId() {
		return hardwareId;
	}

	public void setHardwareId(int hardwareId) {
		this.hardwareId = hardwareId;
	}

	public String getHardwareName() {
		return hardwareName;
	}

	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}

	public double getHardwarePrice() {
		return hardwarePrice;
	}

	public void setHardwarePrice(double hardwarePrice) {
		this.hardwarePrice = hardwarePrice;
	}

	public String getHardwareType() {
		return hardwareType;
	}

	public void setHardwareType(String hardwareType) {
		this.hardwareType = hardwareType;
	}

	@Override
	public String toString() {
		return "Hardware - [hardwareId = " + hardwareId + ", hardwareName = " + hardwareName + ", hardwarePrice = "
				+ hardwarePrice + ", hardwareType = " + hardwareType + "]";
	}

}
