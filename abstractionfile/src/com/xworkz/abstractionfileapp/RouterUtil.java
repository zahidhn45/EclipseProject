package com.xworkz.abstractionfileapp;

public class RouterUtil {

	public static void main(String[] args) {
		Router router = new DLink();
		Router router1 = new DLink(123);

		router.add();
		router.sub();
		router.name();

	}
}
