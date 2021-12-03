package com.xworkz.abstractionapp;

public class ElectionUtil {

	public static void main(String[] args) {
		Election election = new Voters();

		ElectionCommission electionCommission = new ElectionCommission(election);

		System.out.println(electionCommission.cardValidation());
	}
}
