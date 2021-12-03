package com.xworkz.abstractionfileapp;

public class DLink extends Router {

	public DLink(int studentId) {
		super(studentId);
	}

	public DLink() {

	}

	@Override
	public void add() {
		System.out.println("Inside add");
	}

	@Override
	public void sub() {
		System.out.println("Inside sub()");
	}

	public void mult() {
		System.out.println("Mult");
	}

}
