package com.example.hardware;

public class HardwareImpl implements Hardware {

	private HardwareDTO[] hardwareDTO;
	int index;

	public HardwareImpl(int size) {
		hardwareDTO = new HardwareDTO[size];
	}

	@Override
	public boolean addingHardware(HardwareDTO hardwareDTO) {
		boolean isUpdated = false;
		if (hardwareDTO != null) {
			this.hardwareDTO[index++] = hardwareDTO;
			isUpdated = true;
		}
		return isUpdated;
	}

	@Override
	public HardwareDTO searchingHardware(int id) {
		HardwareDTO dto = null;

		for (int i = 0; i < hardwareDTO.length; i++) {
			if (hardwareDTO[i] != null) {
				if (hardwareDTO[i].getHardwareId() == id) {
					dto = hardwareDTO[i];
				}
			}
		}
		return dto;
	}

	@Override
	public boolean updatingHardwareName(int id, String name) {
		boolean isUpdated = false;
		for (int i = 0; i < hardwareDTO.length; i++) {
			if (hardwareDTO[i] != null) {
				if (hardwareDTO[i].getHardwareId() == id) {
					hardwareDTO[i].setHardwareName(name);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}

	@Override
	public boolean deletingHardware(int id) {
		boolean isDeleted = false;
		for (int i = 0; i < hardwareDTO.length; i++) {
			if (hardwareDTO[i] != null) {
				if (hardwareDTO[i].getHardwareId() == id) {
					hardwareDTO[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}

	@Override
	public void printDetails() {
		for (int i = 0; i < hardwareDTO.length; i++) {
			if (hardwareDTO[i] != null) {
				System.out.println(hardwareDTO[i].getHardwareId() + " " + hardwareDTO[i].getHardwareName() + " "
						+ hardwareDTO[i].getPrice() + " " + hardwareDTO[i].getHardwareType());
			}
		}

	}

}
