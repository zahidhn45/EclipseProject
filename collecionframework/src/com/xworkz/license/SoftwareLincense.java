package com.xworkz.license;

public interface SoftwareLincense {

	boolean addingLincense(LicenseDTO licenseDTO);

	LicenseDTO searching(int id);

	boolean updatingName(int id, String name);

	boolean deleting(int id);

	void printDetails();
}
