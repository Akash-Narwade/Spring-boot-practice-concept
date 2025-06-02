package com.training.test;

import java.lang.reflect.Field;

public class MyApp {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
          
		//This Code will be execute by IOC Container
		
		// Loading the class using Class.forName
		Class<?> clz = Class.forName("com.training.test.Demo");

		// Getting Field declare in the class
		Field ageField = clz.getDeclaredField("age");

		// making private variable accessible outside of the class
		ageField.setAccessible(true);

		// Creating Object For the class
		Object object = clz.newInstance();

		// Setting the value to variable
		ageField.set(object, 30); // setting the value to age

		// Getting Value from the variable
		System.out.println(ageField.get(object));

	}
}
