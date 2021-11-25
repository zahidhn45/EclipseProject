package com.xworkz.crudwithinterface.DAO;

import com.xworkz.crudwithinterface.DTO.BusRouteDTO;
import com.xworkz.crudwithinterface.interfacefile.BusRoute;

public class BusRouteDAO implements BusRoute {

	BusRouteDTO[] dto;
	int index;

	public BusRouteDAO(int size) {
		dto = new BusRouteDTO[size];
	}

	@Override
	public boolean createBusRoute(BusRouteDTO dto) {
		System.out.println("Inside createBusRouter()");
		boolean isCreated = false;
		if (dto != null) {
			System.out.println("Created Bus Route......");
			this.dto[index++] = dto;
			isCreated = true;
		}
		return isCreated;
	}

	@Override
	public void displayDetails() {
		boolean flag = false;
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				System.out.println(dto[i].getBusId() + ", " + dto[i].getStartPoint() + ", " + dto[i].getDestination()
						+ ", " + dto[i].getDriverName());
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("No Bus Route found");
		}
	}

	@Override
	public boolean updateStartpointById(int id, String startPoint) {
		System.out.println("Inside updateStartpointById()");
		boolean isUpdated = false;
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				if (dto[i].getBusId() == id) {
					dto[i].setStartPoint(startPoint);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}

	@Override
	public boolean deleteBusRoute(int id) {
		System.out.println("Inside deleteBusRoute()");
		boolean isDeleted = false;
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				if (dto[i].getBusId() == id) {
					dto[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}
}
