package com.xworkz.linkedlistprac.impl;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.linkedlistprac.AssetDAO;
import com.xworkz.linkedlistprac.dto.BookDTO;

public class AssetImpl implements AssetDAO {

	LinkedList<BookDTO> list = new LinkedList<BookDTO>();

	@Override
	public boolean addAsset(Object object) {
		BookDTO dto = (BookDTO) object;
		boolean isAdded = list.add(dto);
		return isAdded;
	}

	@Override
	public boolean searchAsset(int id) {
		boolean found = false;
		Iterator<BookDTO> itr = list.iterator();
		while (itr.hasNext()) {
			BookDTO bookDTO = (BookDTO) itr.next();
			int bookId = bookDTO.getBookId();

			if (bookId == id) {
				System.out.println(bookDTO);
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
		Iterator<BookDTO> itr = list.iterator();
		while (itr.hasNext()) {
			BookDTO bookDTO = itr.next();
			int id1 = bookDTO.getBookId();
			if (id1 == id) {
				bookDTO.setBookName(name);
				isUpdated = true;
			}
		}
		if (!isUpdated) {
			System.out.println("Not found");
		}
		return isUpdated;
	}

	@Override
	public boolean deleteAsset(int id) {
		boolean flag = false;
		Iterator<BookDTO> itr = list.iterator();
		while (itr.hasNext()) {
			BookDTO dto = itr.next();
			int id1 = dto.getBookId();

			if (id1 == id) {
				itr.remove();
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Nothing to remove");
		}
		return flag;
	}

	@Override
	public void listAsset() {
		Iterator<BookDTO> itr = list.iterator();
		while (itr.hasNext()) {
			BookDTO bookDTO = (BookDTO) itr.next();
			System.out.println(bookDTO);
		}

	}

	@Override
	public void setAsset(int index, Object object) {
		BookDTO dto = (BookDTO) object;
		list.add(index, dto);
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
		System.out.println(list.getFirst());

	}

	@Override
	public void getLastAsset() {
		System.out.println(list.getLast());

	}

	@Override
	public void addFirstAsset(Object object) {
		BookDTO dto = (BookDTO) object;
		list.addFirst(dto);

	}

	@Override
	public void addLastAsset(Object object) {
		BookDTO dto = (BookDTO) object;
		list.addLast(dto);
	}

}
