package com.xworkz.abstractionfileapp;

public class LedLightImplementation implements Switch {

	@Override
	public void sOn() {
		System.out.println("LED Light switched on");

	}

	@Override
	public void sOff() {
		System.out.println("LED Light switched off");
	}

}
