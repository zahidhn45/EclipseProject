package com.xworkz.linkedlistprac.impl;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.linkedlistprac.AssetDAO;
import com.xworkz.linkedlistprac.dto.SoftwareDTO;

public class SoftwareImpl implements AssetDAO {

	LinkedList<SoftwareDTO> list = new LinkedList<SoftwareDTO>();

	@Override
	public boolean addAsset(Object obj) {
		SoftwareDTO dto = (SoftwareDTO) obj;
		boolean added = list.add(dto);
		return added;
	}

	@Override
	public boolean searchAsset(int id) {
		boolean found = false;
		Iterator<SoftwareDTO> itr = list.iterator();
		while (itr.hasNext()) {
			SoftwareDTO softwareDTO = itr.next();
			int softwareId = softwareDTO.getSoftwareId();

			if (softwareId == id) {
				System.out.println(softwareDTO);
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
		Iterator<SoftwareDTO> itr = list.iterator();
		while (itr.hasNext()) {
			SoftwareDTO softwareDTO = itr.next();
			int softwareId = softwareDTO.getSoftwareId();

			if (softwareId == id) {
				softwareDTO.setSoftwareName(name);
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
		Iterator<SoftwareDTO> itr = list.iterator();
		while (itr.hasNext()) {
			SoftwareDTO softwareDTO = itr.next();
			int softwareId = softwareDTO.getSoftwareId();

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
		Iterator<SoftwareDTO> itr = list.iterator();
		while (itr.hasNext()) {
			SoftwareDTO softwareDTO = itr.next();
			System.out.println(softwareDTO);
		}
	}

	@Override
	public void setAsset(int index, Object object) {
		SoftwareDTO dto = (SoftwareDTO) object;
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
		SoftwareDTO dto = (SoftwareDTO) object;
		list.addFirst(dto);
	}

	@Override
	public void addLastAsset(Object object) {
		SoftwareDTO dto = (SoftwareDTO) object;
		list.addLast(dto);
	}

}
