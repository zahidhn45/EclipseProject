package com.xworkz.presentation;

public class Paytm implements Upi {

	PaytmDTO[] paytmDTO;
	int index;

	public Paytm(int size) {
		paytmDTO = new PaytmDTO[size];
	}

	@Override
	public boolean addMoney(PaytmDTO paytmDTO) {
		boolean isAdded = false;
		System.out.println("Inside addMoney()");
		if (paytmDTO != null) {
			this.paytmDTO[index++] = paytmDTO;
			isAdded = true;
		} else {
			System.out.println("Nothing to add");
		}
		return isAdded;
	}

	@Override
	public void readDetails() {
		for (int i = 0; i < paytmDTO.length; i++) {
			if (paytmDTO != null) {
				System.out.println(
						paytmDTO[i].getPaytmId() + ", " + paytmDTO[i].getAmount() + ", " + paytmDTO[i].getName());
			}
		}
	}

	@Override
	public boolean updateAmount(int id, String name) {
		System.out.println("Inside updateAmount()");
		boolean isUpdated = false;
		for (int i = 0; i < paytmDTO.length; i++) {
			if (paytmDTO != null) {
				if (paytmDTO[i].getPaytmId() == id) {
					paytmDTO[i].setName(name);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}

	@Override
	public boolean deleteAccount(int id) {
		System.out.println("Inside transferAmount()");
		boolean isDeleted = false;

		for (int i = 0; i < paytmDTO.length; i++) {
			if (paytmDTO != null) {
				if (paytmDTO[i].getPaytmId() == id) {
					paytmDTO[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}
}
