package com.yiibai.tutorial.javabasic.array;

public class ArrayExample2 {
	public static void main(String[] args) {

		// Declare an array with 5 elements
		int[] myArray = new int[5];

		// Print out element count
		System.out.println("Array Length=" + myArray.length);

		// Using loop assign values to elements of the array.
		for (int index = 0; index < myArray.length; index++) {
			myArray[index] = 100 * index * index + 3;
		}

		// Print out the element at index 3
		System.out.println("myArray[3] = " + myArray[3]);
	}
}
