package com.xworkz.practiceproblems.question5;

import java.util.ArrayList;
import java.util.Iterator;

import com.xworkz.practiceproblems.question3.dto.HallDTO;

public class Hall {
	ArrayList<HallDTO> list = new ArrayList<HallDTO>();

	public void add(HallDTO dto) {
		list.add(dto);
	}

	public void display() {
		if (list.isEmpty()) {
			System.out.println("The list is empty");
		} else {
			System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Cost per Day", "OwnerName");
			Iterator<HallDTO> itr = list.iterator();
			while (itr.hasNext()) {
				HallDTO hallDTO = (HallDTO) itr.next();
				System.out.println(hallDTO);
			}
		}

	}

	public void remove(int index) {
		try {
			list.remove(index);
			display();
		} catch (IndexOutOfBoundsException e) {
			System.err.println(index + " does not exist");
		}

	}

}
