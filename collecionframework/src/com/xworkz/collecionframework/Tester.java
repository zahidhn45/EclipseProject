package com.xworkz.collecionframework;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		List list = new ArrayList();

		String name = "abc";
		int age = 24;
		boolean isMarried = true;
		long phone = 213564789L;

		list.add(name);
		list.add(age);
		list.add(isMarried);
		list.add(phone);

		System.out.println(list); // print all the list element
		System.out.println("Size: " + list.size()); // gives the size of the list
		System.out.println("Present abc " + list.contains("abcd")); // check "abc" is present in list or not
		// list.remove(name); // it will remove the name from the list
		System.out.println(list);

		List list2 = new ArrayList<>();

		list2.add("abcd");
		list2.add(244);
		list2.add(false);
		list2.add(124569855L);
		System.out.println(list2);

		list.addAll(list2); // it will add list2 in list
		System.out.println(list);
		System.out.println("Contains list2: " + list.containsAll(list2)); // it will check list 2 is present in list
		list.removeAll(list2); // it will remove list2 form list as well as all the matching value from list
		System.out.println(list);
		list.clear(); // remove everything from list
		System.out.println(list);
		list.retainAll(list2); // it will print all the element of list2 and print only the matching element
								// from list
		System.out.println(list);
		System.out.println(list.isEmpty()); // check the list is empty or not...

	}
}
