package com.xworkz.crudwithinterface;

import java.util.Scanner;

import com.xworkz.crudwithinterface.DAO.BusRouteDAO;
import com.xworkz.crudwithinterface.DTO.BusRouteDTO;

public class BusRouteUtil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int size = sc.nextInt();
		BusRouteDAO dao = new BusRouteDAO(size);

		for (int i = 0; i < size; i++) {
			BusRouteDTO dto = new BusRouteDTO();

			System.out.println("Enter Bus id");
			dto.setBusId(sc.nextInt());

			System.out.println("Enter Start point");
			dto.setStartPoint(sc.next());

			System.out.println("Enter Destination");
			dto.setDestination(sc.next());

			System.out.println("Enter Driver name");
			dto.setDriverName(sc.next());

			dao.createBusRoute(dto);
		}

		int ans = 0;

		do {
			System.out.println("Choose a option\n1. To know About  Route\n2. Update Start point\n3. To delete Recore");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				dao.displayDetails();
				break;
			case 2:
				System.out.println("Enter id for which you want to update name");
				int id = sc.nextInt();
				System.out.println("Enter update Start point");
				String startPoint = sc.next();
				dao.updateStartpointById(id, startPoint);
				break;
			case 3:
				System.out.println("Enter id to ddelete a recored");
				int deletedId = sc.nextInt();
				dao.deleteBusRoute(deletedId);
				break;
			default:
				System.out.println("Enter from given choice");
				break;
			}
			System.out.println("Do you want to perform more operation if yes press 1 or press any key to exit");
			ans = sc.nextInt();
		} while (ans == 1);
		sc.close();
	}
}
