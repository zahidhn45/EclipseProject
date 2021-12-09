package com.example.hardware;

import java.util.Scanner;

public class HardwareTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size");
		int size = sc.nextInt();

		Hardware hardware = new Keyboard(size);
		Keyboard keyboard = new Keyboard(size);

		keyboard.HardwareName();

		int ans = 0;

		for (int i = 0; i < size; i++) {
			HardwareDTO dto = new HardwareDTO();
			System.out.println("Enter Hardware id");
			dto.setHardwareId(sc.nextInt());

			System.out.println("Enter hardware name");
			dto.setHardwareName(sc.next());

			System.out.println("Enter price");
			dto.setPrice(sc.nextDouble());

			System.out.println("Enter hardware type");
			dto.setHardwareType(sc.next());

			hardware.addingHardware(dto);

		}

		do {
			System.out.println("Enter a choice");
			System.out.println("1. Search\n2. Update Hardware name\n3. Delete\n4. Display");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter id to search");
				HardwareDTO dto = hardware.searchingHardware(sc.nextInt());
				if (dto != null) {
					System.out.println(dto.getHardwareId() + " " + dto.getHardwareName() + " " + dto.getPrice() + " "
							+ dto.getHardwareType());
				}
				break;
			case 2:
				System.out.println("Enter id to update name");
				int id = sc.nextInt();

				System.out.println("Enter updated name");
				String name = sc.next();
				hardware.updatingHardwareName(id, name);
				System.out.println("Updating done..!!!");
				break;
			case 3:
				System.out.println("Enter id to delete");
				hardware.deletingHardware(sc.nextInt());
				System.out.println("Deleting done");
				break;
			case 4:
				hardware.printDetails();
				break;

			default:
				System.out.println("Enter from the give choice");
				break;
			}
			System.out.println("Do you want to perform more operation if yes press 1 or press any key to exit");
			ans = sc.nextInt();
		} while (ans == 1);
		sc.close();
	}
}
