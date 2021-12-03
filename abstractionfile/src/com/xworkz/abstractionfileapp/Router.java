package com.xworkz.abstractionfileapp;

public abstract class Router {
	int studentId;

	public Router() {
		// TODO Auto-generated constructor stub
	}

	public Router(int studentId) {
		this.studentId = studentId;
	}

	public abstract void add(); // abstract method

	public abstract void sub();

	public void name() {
		System.out.println("hello");
	} // concrete method..

}
