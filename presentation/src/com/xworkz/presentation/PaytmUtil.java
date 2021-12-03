package com.xworkz.presentation;

import java.util.Scanner;

public class PaytmUtil {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		Upi upi = new Paytm(size);

		for (int i = 0; i < size; i++) {
			PaytmDTO dto = new PaytmDTO();

			System.out.println("Enter Paytm id");
			dto.setPaytmId(sc.nextInt());

			System.out.println("Enter Amount ");
			dto.setAmount(sc.nextDouble());

			System.out.println("Enter name");
			dto.setName(sc.next());

			upi.addMoney(dto);
		}
		int ans = 0;

		do {

			System.out.println("Enter choice\n1.Read\n2. Update\n3.Delete");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				upi.readDetails();
				break;
			case 2:
				System.out.println("Enter id for you you want to update the name");
				int id = sc.nextInt();
				System.out.println("Enter the update name");
				String name = sc.next();
				upi.updateAmount(id, name);
				break;
			case 3:
				System.out.println("Enter the id for which you want to delete");
				upi.deleteAccount(sc.nextInt());
				break;
			default:
				break;
			}
			System.out.println("Do you want to perfor more operation");
			ans = sc.nextInt();
		} while (ans == 1);

		sc.close();
	}
}
