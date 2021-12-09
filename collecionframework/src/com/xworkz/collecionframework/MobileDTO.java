package com.xworkz.collecionframework;

public class MobileDTO {

	private int id;
	private String name;
	private double price;
	private int ram;
	private int rom;
	private int cameraPixel;
	private int batteryCapacity;

	public MobileDTO(int id, String name, double price, int ram, int rom, int cameraPixel, int batteryCapacity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.cameraPixel = cameraPixel;
		this.batteryCapacity = batteryCapacity;
	}

	public MobileDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public int getCameraPixel() {
		return cameraPixel;
	}

	public void setCameraPixel(int cameraPixel) {
		this.cameraPixel = cameraPixel;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public String toString() {
		return "Mobile - [id = " + id + ", name = " + name + ", price = " + price + ", ram = " + ram + ", rom = " + rom
				+ ", cameraPixel = " + cameraPixel + ", batteryCapacity = " + batteryCapacity + "]";
	}

}
