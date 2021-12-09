package com.xworkz.license;

public class LicenseImpl implements SoftwareLincense {

	private LicenseDTO[] licenseDTO;
	int index;

	public LicenseImpl(int size) {
		licenseDTO = new LicenseDTO[size];
	}

	@Override
	public boolean addingLincense(LicenseDTO licenseDTO) {
		boolean isAdded = false;
		if (licenseDTO != null) {
			this.licenseDTO[index++] = licenseDTO;
			isAdded = true;
		}
		return isAdded;
	}

	@Override
	public LicenseDTO searching(int id) {
		LicenseDTO dto = null;
		for (int i = 0; i < licenseDTO.length; i++) {
			if (licenseDTO[i].getLicenseId() == id) {
				dto = licenseDTO[i];
			}
		}
		return dto;
	}

	@Override
	public boolean updatingName(int id, String name) {
		boolean isUpdated = false;
		for (int i = 0; i < licenseDTO.length; i++) {
			if (licenseDTO[i].getLicenseId() == id) {
				licenseDTO[i].setSoftwarename(name);
				isUpdated = true;
			}
		}
		return isUpdated;
	}

	@Override
	public boolean deleting(int id) {
		boolean isDeleted = false;
		for (int i = 0; i < licenseDTO.length; i++) {
			if (licenseDTO[i] != null) {
				if (licenseDTO[i].getLicenseId() == id) {
					licenseDTO[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}

	@Override
	public void printDetails() {
		for (int i = 0; i < licenseDTO.length; i++) {
			if (licenseDTO[i] != null) {
				System.out.println(licenseDTO[i].getLicenseId() + " " + licenseDTO[i].getSoftwarename() + " "
						+ licenseDTO[i].getSoftwareSize() + " " + licenseDTO[i].getSoftwareType() + " "
						+ licenseDTO[i].getSoftwareVersion());
			}
		}

	}

}
