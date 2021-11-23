package com.xworkz.interfaceprogram;

public class TataInternet implements Internet {

	@Override
	public boolean connect() {
		return false;
	}

	@Override
	public int speed() {
		return 5;
	}

	@Override
	public void disconnect() {
		if (connect() == false || speed() < 1) {
			System.err.println("Connection not good");
		}
	}

}
