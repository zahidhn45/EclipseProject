package com.xworkz.linkedlistprac.impl;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.linkedlistprac.AssetDAO;
import com.xworkz.linkedlistprac.dto.HardwareDTO;

public class HardwareImpl implements AssetDAO {

	LinkedList<HardwareDTO> list = new LinkedList<HardwareDTO>();

	@Override
	public boolean addAsset(Object obj) {
		HardwareDTO dto = (HardwareDTO) obj;
		boolean added = list.add(dto);
		return added;
	}

	@Override
	public boolean searchAsset(int id) {
		boolean found = false;
		Iterator<HardwareDTO> itr = list.iterator();
		while (itr.hasNext()) {
			HardwareDTO HardwareDTO = itr.next();
			int softwareId = HardwareDTO.getHardwareId();

			if (softwareId == id) {
				System.out.println(HardwareDTO);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Element not found");
		}
		return found;
	}

	@Override
	public boolean updateAsset(int id, String name) {
		boolean isUpdated = false;
		Iterator<HardwareDTO> itr = list.iterator();
		while (itr.hasNext()) {
			HardwareDTO HardwareDTO = itr.next();
			int softwareId = HardwareDTO.getHardwareId();

			if (softwareId == id) {
				HardwareDTO.setHardwareName(name);
				isUpdated = true;
			}
		}
		if (!isUpdated) {
			System.out.println("Element not updated");
		}
		return isUpdated;

	}

	@Override
	public boolean deleteAsset(int id) {
		boolean isDeleted = false;
		Iterator<HardwareDTO> itr = list.iterator();
		while (itr.hasNext()) {
			HardwareDTO HardwareDTO = itr.next();
			int softwareId = HardwareDTO.getHardwareId();

			if (softwareId == id) {
				itr.remove();
				isDeleted = true;
			}
		}
		if (!isDeleted) {
			System.out.println("Nothing to delete");
		}
		return isDeleted;
	}

	@Override
	public void listAsset() {
		Iterator<HardwareDTO> itr = list.iterator();
		while (itr.hasNext()) {
			HardwareDTO HardwareDTO = itr.next();
			System.out.println(HardwareDTO);
		}
	}

	@Override
	public void setAsset(int index, Object object) {
		HardwareDTO dto = (HardwareDTO) object;
		list.set(index, dto);
	}

	@Override
	public void removeLastAsset() {
		list.removeLast();
	}

	@Override
	public void removeFirstAsset() {
		list.removeFirst();
	}

	@Override
	public void getFirstAsset() {
		list.getFirst();
	}

	@Override
	public void getLastAsset() {
		list.getLast();
	}

	@Override
	public void addFirstAsset(Object object) {
		HardwareDTO dto = (HardwareDTO) object;
		list.addFirst(dto);
	}

	@Override
	public void addLastAsset(Object object) {
		HardwareDTO dto = (HardwareDTO) object;
		list.addLast(dto);
	}

}
