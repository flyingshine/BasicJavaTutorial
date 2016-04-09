package com.yiibai.tutorial.javabasic.loop;

public class WhileExample1 {
	public static void main(String[] args) {

		int value = 3;

		// While the value is less than 10, the loop is working.
		while (value < 10) {

			System.out.println("Value = " + value);

			// Increase value by adding 2
			value = value + 2;
		}
	}
}
