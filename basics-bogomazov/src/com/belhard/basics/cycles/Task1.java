package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.MathOperations;

import com.belhard.basics.exceptions.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input number (positive integer).");
		System.out.println("Following application will show the sum of integers from 1 to your number.");
		int upperRange = (int) ConsoleReader.getDoubleType(in);
		in.close();
		try {
			if (upperRange < 1) {
				throw new IllegalNumberException();
			}
		}catch(Exception e) {
			System.out.println("Invalid unput! Positive integer required!");
			return;
		}
		
		int result = MathOperations.sumOfNumbersFromOneToNumber(upperRange);
		
		System.out.println("Sum of numbers from 1 to " + upperRange + " is: " + result);
		
	}

	
	public static int sumOfNumbersFromOneToNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
}
