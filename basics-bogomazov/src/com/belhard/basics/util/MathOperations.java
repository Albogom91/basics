package com.belhard.basics.util;

public class MathOperations {

	public static void main(String[] args) {

	}
	
	public static double getMinimalValueOfTwoNumbers(double a, double b) {
		if (a <= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static double getMaximalValueOfTwoNumbers(double a, double b) {
		if (a >= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static int sumOfNumbersFromOneToNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int sumOfSquareNumbersFromOneToNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i*i;
		}
		return sum;
	}
	

}
