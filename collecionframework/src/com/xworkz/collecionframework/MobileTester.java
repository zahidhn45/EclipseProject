package com.xworkz.collecionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobileTester {

	public static void main(String[] args) {
		List<MobileDTO> list = new ArrayList<MobileDTO>();
		Scanner sc = new Scanner(System.in);
		Mobile mobile = new Mobile();

		int ans = 0;
		do {
			System.out.println("Enter a choice");
			System.out.println(
					"1. Add element\n2. Print all the details\n3. Make call\n4. Text\n5. video call\n6. Browse\n7. Play game\n8. Play Audio");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				do {
					System.out.println("Enter Mobile id");
					int mobileId = sc.nextInt();

					System.out.println("Enter Mobile name");
					String mobilename = sc.next();

					System.out.println("Enter Mobile Price");
					double mobilePrice = sc.nextDouble();

					System.out.println("Enter RAM");
					int mobileRam = sc.nextInt();

					System.out.println("Enter ROM");
					int mobileRom = sc.nextInt();

					System.out.println("Enter camera pixel");
					int cameraPixel = sc.nextInt();

					System.out.println("Enter battery capicity");
					int batteryCapacity = sc.nextInt();

					list.add(new MobileDTO(mobileId, mobilename, mobilePrice, mobileRam, mobileRom, cameraPixel,
							batteryCapacity));

					System.out.println("Do you want to add more items if yes press 1 or press any key to exit");
					ans = sc.nextInt();
				} while (ans == 1);
				ans = 0;
				System.out.println("Item Added to the list");
				break;
			case 2:
				if (list.isEmpty()) {
					System.out.println("List is empty..! Nothing to display");
				} else {
					System.out.println(list);
					System.out.println();
				}
				break;
			case 3:
				mobile.makecall();
				break;
			case 4:
				mobile.text();
				break;
			case 5:
				mobile.videoCall();
				break;
			case 6:
				mobile.browse();
				break;
			case 7:
				mobile.playGame();
				break;
			case 8:
				mobile.playAudio();
				break;

			default:
				System.out.println("Enter from given choice");
				break;
			}
			System.out.println();
			System.out.println("Do you want to perform more operations press 1 to add or any key to exit");
			ans = sc.nextInt();
		} while (ans == 1);
		System.out.println("Thanks for using");

		sc.close();
	}
}
