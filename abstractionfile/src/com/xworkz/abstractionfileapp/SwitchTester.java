package com.xworkz.abstractionfileapp;

public class SwitchTester {
	public static void main(String[] args) {
		Switch switch1 = new TubeLightImplementation();
		switch1.sOff();
		switch1.sOn();

		Switch switch2 = new LedLightImplementation();
		switch2.sOn();
		switch2.sOff();
	}
}
