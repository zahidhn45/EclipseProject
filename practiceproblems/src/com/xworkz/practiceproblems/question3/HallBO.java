package com.xworkz.practiceproblems.question3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.practiceproblems.question3.dto.HallDTO;

public class HallBO {

	Collection<HallDTO> collection = new ArrayList<HallDTO>();

	public void add(HallDTO dto) {
		collection.add(dto);
	}

	public void replace(int id, HallDTO dto) {
		List<HallDTO> list = (List<HallDTO>) collection;
		list.set(id, dto);
	}

	public void display() {
		System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Cost per Day", "OwnerName");
		Iterator<HallDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			HallDTO hallDTO = (HallDTO) itr.next();
			System.out.println(hallDTO);
		}
	}
}
