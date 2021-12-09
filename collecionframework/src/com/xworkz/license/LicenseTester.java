package com.xworkz.license;

import java.util.Scanner;

public class LicenseTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		SoftwareLincense license = new LicenseImpl(size);

		for (int i = 0; i < size; i++) {
			LicenseDTO dto = new LicenseDTO();

			System.out.println("Enter license id");
			dto.setLicenseId(sc.nextInt());

			System.out.println("Enter software name");
			dto.setSoftwarename(sc.next());

			System.out.println("Enter software version");
			dto.setSoftwareVersion(sc.nextDouble());

			System.out.println("Enter software type");
			dto.setSoftwareType(sc.next());

			System.out.println("Enter software size");
			dto.setSoftwareSize(sc.nextDouble());

			license.addingLincense(dto);
		}

		int ans = 0;

		do {
			System.out.println("Enter choice");
			System.out.println("1. update\n2. delete\n3. Search\n4. Display");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter id to update");
				int id = sc.nextInt();
				System.out.println("Enter updated name");
				String name = sc.next();

				license.updatingName(id, name);
				System.out.println("Updating done");
				break;

			case 2:
				System.out.println("Enter id to delete");
				license.deleting(sc.nextInt());
				System.out.println("Deleting done");
				break;
			case 3:
				System.out.println("Enter id to search");
				LicenseDTO dto = license.searching(sc.nextInt());
				if (dto != null) {
					System.out.println(dto.getLicenseId() + " " + dto.getSoftwarename() + " " + dto.getSoftwareType()
							+ " " + dto.getSoftwareVersion() + " " + dto.getSoftwareSize());
				}
				break;
			case 4:
				license.printDetails();
				break;
			default:
				System.out.println("Enter from given choice");
				break;
			}
			System.out.println("Do you want to perform more operation if yes press 1 else press any key to exit");
			ans = sc.nextInt();
		} while (ans == 1);
		sc.close();
	}
}
