package com.example.hardware;

public interface Hardware {

	boolean addingHardware(HardwareDTO hardwareDTO);

	HardwareDTO searchingHardware(int id);

	boolean updatingHardwareName(int id, String name);

	boolean deletingHardware(int id);

	void printDetails();
}
