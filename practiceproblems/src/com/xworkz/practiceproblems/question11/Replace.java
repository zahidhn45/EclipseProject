package com.xworkz.practiceproblems.question11;

public class Replace {

	public static void removeUpperCase(String str) {
		str = str.replaceAll("[A-Z]", "");
		System.out.println(str);
	}

	public static void removeLowerCase(String str) {
		str = str.replaceAll("[a-z]", "");
		System.out.println(str);
	}

	public static void removeNumber(String str) {
		str = str.replaceAll("[0-9]", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "ZaFSDfgg125";
		removeUpperCase(str + " -------- upper case removed");
		removeLowerCase(str + " -------- LOWER CASE REMOVED");
		removeNumber(str + " -------- number removed");
	}
}
