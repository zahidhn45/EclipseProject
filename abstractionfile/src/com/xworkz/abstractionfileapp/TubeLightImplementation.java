package com.xworkz.abstractionfileapp;

public class TubeLightImplementation implements Switch {

	@Override
	public void sOn() {
		System.out.println("Tube light switch on");
	}

	@Override
	public void sOff() {
		System.out.println("Tube light switched off");
	}

}
