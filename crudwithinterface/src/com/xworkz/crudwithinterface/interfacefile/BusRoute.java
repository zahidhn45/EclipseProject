package com.xworkz.crudwithinterface.interfacefile;

import com.xworkz.crudwithinterface.DTO.BusRouteDTO;

public interface BusRoute {

	boolean createBusRoute(BusRouteDTO dto);

	void displayDetails();

	boolean updateStartpointById(int id, String startPoint);

	boolean deleteBusRoute(int id);
}
