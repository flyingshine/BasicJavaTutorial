package com.yiibai.tutorial.javabasic.controlflow;

public class SwitchExample1 {
	public static void main(String[] args) {

		// Declare a variable age
		int age = 20;

		// Check the value of age
		switch (age) {

		// Case age = 18
		case 18:
			System.out.println("You are 18 year old");
			break;

		// Case age = 20
		case 20:
			System.out.println("You are 20 year old");
			break;

		// Remaining cases
		default:
			System.out.println("You are not 18 or 20 year old");
		}

	}
}
