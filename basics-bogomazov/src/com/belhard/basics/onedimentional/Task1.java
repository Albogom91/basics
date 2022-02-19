package com.belhard.basics.onedimentional;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ArrayMethods;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("You will be asked to input amount of numbers in your array (positive integer) and ");
		System.out.println("your denominator (positive or negative integer, except zero).");
		int arrayLength = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(arrayLength);
		int denominator = (int) ConsoleReader.getDoubleType(in);
		if (denominator == 0) {
			System.out.println("Invalid denominator, can't divide by zero!");
			return;
		}
		in.close();
		
		int RANDOM_LW_LIMIT = -100;
		int RANDOM_UP_LIMIT = 100;
		int[] array = ArrayMethods.fillOneDimArrayRandom(arrayLength, RANDOM_LW_LIMIT, RANDOM_UP_LIMIT);
		ArrayMethods.showOneDimArray(array);
		int sum = countSumOfArrayElementsDividedByNumber(array, denominator);

		System.out.println("Sum of array elements divided by " + denominator + " is " + sum);
	}
	
	public static int countSumOfArrayElementsDividedByNumber (int[] array, int denominator) {
		int sum = 0;
		for (int num : array) {
			if (num % denominator == 0) {
				sum += num;
			}
		}
		return sum;
	}

}
