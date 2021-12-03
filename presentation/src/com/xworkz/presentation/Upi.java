package com.xworkz.presentation;

// CRUD operation in interface
public interface Upi {

	boolean addMoney(PaytmDTO paytmDTO);

	void readDetails();

	boolean updateAmount(int id, String name);

	boolean deleteAccount(int id);
}
