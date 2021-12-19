package com.xworkz.linkedlistprac;

import java.util.Scanner;

import com.xworkz.linkedlistprac.dto.SoftwareDTO;
import com.xworkz.linkedlistprac.impl.SoftwareImpl;

public class SoftwareTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AssetDAO dao = new SoftwareImpl();
		SoftwareDTO dto;
		int ans = 0;

		do {
			System.out.println("Enter a choice");
			System.out.println(
					"1. Add Software\n2. Search Software\n3. Update Software\n4. Delete Software\n5. List all Software\n6. Add Software at particular Index");
			System.out.println(
					"7. Delete last Software\n8. Delete First Software\n9. Display First Software\n10. Display last Software");
			System.out.println("11. Add Software in first position\n12. Add Software in last position");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				do {
					System.out.println("Enter software id, name, size, Internet required");
					dto = new SoftwareDTO(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextBoolean());
					boolean added = dao.addAsset(dto);
					System.out.println("Software added " + added);
					System.out.println("Do you want to add more\nIf yes press 1 else press aany key");
					ans = sc.nextInt();
				} while (ans == 1);
				ans = 0;
				break;
			case 2:
				System.out.println("Enter id to search Software");
				boolean found = dao.searchAsset(sc.nextInt());
				System.out.println("Resuld found " + found);
				break;
			case 3:
				System.out.println("Enter id to update Software and enter updated Software name");
				boolean updated = dao.updateAsset(sc.nextInt(), sc.next());
				System.out.println("Software updated " + updated);
				break;
			case 4:
				System.out.println("Enter id to delete Software");
				boolean deleted = dao.deleteAsset(sc.nextInt());
				System.out.println("Software deleted " + deleted);
				break;
			case 5:
				dao.listAsset();
				break;
			case 6:
				System.out.println("Enter id, name, size, internet required");
				SoftwareDTO dto2 = new SoftwareDTO(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextBoolean());
				System.out.println("Enter index where u want to add Software");
				dao.setAsset(sc.nextInt(), dto2);
				System.out.println("Software added......!");
				break;
			case 7:
				dao.removeLastAsset();
				System.out.println("Software removed.....!");
				break;
			case 8:
				dao.removeFirstAsset();
				System.out.println("Software removed.....!");
				break;
			case 9:
				dao.getFirstAsset();
				break;
			case 10:
				dao.getLastAsset();
				break;
			case 11:
				System.out.println("Enter id, name, size, internet required");
				SoftwareDTO dto3 = new SoftwareDTO(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextBoolean());
				dao.addFirstAsset(dto3);
				System.out.println("Software added.....!");
				break;
			case 12:
				System.out.println("Enter id, name, size, internet required");
				SoftwareDTO dto4 = new SoftwareDTO(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextBoolean());
				dao.addLastAsset(dto4);
				System.out.println("Software added...!");
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
