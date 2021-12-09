package com.example.hardware;

public class HardwareDTO {

	private int hardwareId;
	private String hardwareName;
	private double price;
	private String hardwareType;

	public HardwareDTO() {
		// TODO Auto-generated constructor stub
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getHardwareType() {
		return hardwareType;
	}

	public void setHardwareType(String hardwareType) {
		this.hardwareType = hardwareType;
	}

	@Override
	public String toString() {
		return "HardwareDTO [hardwareId=" + hardwareId + ", hardwareName=" + hardwareName + ", price=" + price
				+ ", hardwareType=" + hardwareType + "]";
	}

}
