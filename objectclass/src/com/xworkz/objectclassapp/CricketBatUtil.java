package com.xworkz.objectclassapp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CricketBatUtil {
	public static void main(String[] args) {

		CricketBat bat = new CricketBat("MRF ", "English willow", 850.00, "willow wood");
		System.out.println(bat);

		Class class1 = bat.getClass();
		System.out.println(class1.getName());
		System.out.println(class1.getPackageName());
		System.out.println(class1.getSuperclass());
		System.out.println(class1.getMethods().length);
		System.out.println(class1.getFields().length);
		System.out.println(class1.getConstructors().length);
		System.out.println(class1.getCanonicalName());
		System.out.println(class1.getModifiers());
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getTypeName());

		Constructor[] constructor = class1.getConstructors();
		for (int i = 0; i < constructor.length; i++) {
			Constructor constructor2 = constructor[i];
			System.out.println(constructor2.getName());
			System.out.println(constructor2.getParameterCount());

		}

		Method[] methods = class1.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			System.out.println(method.getModifiers());
			System.out.println(method.getDefaultValue());
			System.out.println(method.getReturnType());
		}
	}
}
