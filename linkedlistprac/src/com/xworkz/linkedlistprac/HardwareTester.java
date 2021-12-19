package com.xworkz.linkedlistprac;

import java.util.Scanner;

import com.xworkz.linkedlistprac.dto.HardwareDTO;
import com.xworkz.linkedlistprac.impl.HardwareImpl;

public class HardwareTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AssetDAO dao = new HardwareImpl();
		HardwareDTO dto;
		int ans = 0;

		do {
			System.out.println("Enter a choice");
			System.out.println(
					"1. Add Hardware\n2. Search Hardware\n3. Update Hardware\n4. Delete Hardware\n5. List all Hardware\n6. Add Hardware at particular Index");
			System.out.println(
					"7. Delete last Hardware\n8. Delete First Hardware\n9. Display First Hardware\n10. Display last Hardware");
			System.out.println("11. Add Hardware in first position\n12. Add Hardware in last position");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				do {
					System.out.println("Enter Hardware id, name, price, Type");
					dto = new HardwareDTO(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
					boolean added = dao.addAsset(dto);
					System.out.println("Hardware added " + added);
					System.out.println("Do you want to add more\nIf yes press 1 else press aany key");
					ans = sc.nextInt();
				} while (ans == 1);
				ans = 0;
				break;
			case 2:
				System.out.println("Enter id to search Hardware");
				boolean found = dao.searchAsset(sc.nextInt());
				System.out.println("Resuld found " + found);
				break;
			case 3:
				System.out.println("Enter id to update Hardware and enter updated Hardware name");
				boolean updated = dao.updateAsset(sc.nextInt(), sc.next());
				System.out.println("Hardware updated " + updated);
				break;
			case 4:
				System.out.println("Enter id to delete Hardware");
				boolean deleted = dao.deleteAsset(sc.nextInt());
				System.out.println("Hardware deleted " + deleted);
				break;
			case 5:
				dao.listAsset();
				break;
			case 6:
				System.out.println("Enter Hardware id, name, price, Type");
				HardwareDTO dto2 = new HardwareDTO(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
				System.out.println("Enter index where u want to add Hardware");
				dao.setAsset(sc.nextInt(), dto2);
				System.out.println("Hardware added......!");
				break;
			case 7:
				dao.removeLastAsset();
				System.out.println("Hardware removed.....!");
				break;
			case 8:
				dao.removeFirstAsset();
				System.out.println("Hardware removed.....!");
				break;
			case 9:
				dao.getFirstAsset();
				break;
			case 10:
				dao.getLastAsset();
				break;
			case 11:
				System.out.println("Enter Hardware id, name, price, Type");
				HardwareDTO dto3 = new HardwareDTO(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
				dao.addFirstAsset(dto3);
				System.out.println("Hardware added.....!");
				break;
			case 12:
				System.out.println("Enter Hardware id, name, price, Type");
				HardwareDTO dto4 = new HardwareDTO(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
				dao.addLastAsset(dto4);
				System.out.println("Hardware added...!");
				break;
			default:
				System.out.println("Enter from given choice");
				break;
			}
			System.out.println("Do you want to perform more operation\nIf yes press 1 else press any key");
			ans = sc.nextInt();
		} while (ans == 1);
		System.out.println("Thanks for using");
		sc.close();
	}
}
