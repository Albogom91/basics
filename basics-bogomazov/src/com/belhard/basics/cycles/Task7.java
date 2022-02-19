package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.exceptions.IllegalRangeInputException;
import com.belhard.basics.util.ConsoleReader;

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input two numbers.");
		System.out.println("These two numbers will define start and end of the interval.");
		System.out.println("Following application will show denominators of all natural numbers in this interval.");
		int lowerRange = (int) ConsoleReader.getDoubleType(in);
		int upperRange = (int) ConsoleReader.getDoubleType(in);
		in.close();
		
		try {
			if (upperRange < 0 || lowerRange < 0 || lowerRange > upperRange) {
				throw new IllegalRangeInputException();
			}
		}catch(Exception e) {
			System.out.println("Invalid range!");
			return;
		}

		showDenominatorsOfNumbersInInterval(lowerRange, upperRange);
		
	}
	
	public static void showDenominatorsOfNumber (int number) {
		int count = 0;
		if (number == 1) {
			System.out.println("no such denominators");
			return;
		}
		for (int j = 2; j <= number / 2; j++) {
			if (number % j == 0) {
				System.out.print(j + " ");
				count++;
			}
		}
		if (count > 0) {
			System.out.println();
			return;
		} else {
			System.out.println("no such denominators (prime number)");
			return;
		}
	}

	public static void showDenominatorsOfNumbersInInterval(int lowerRange, int upperRange) {
		for (int i = lowerRange; i <= upperRange; i++) {
			System.out.print("Denominators of " + i + " (except 1 and " + i + ")" + " are: ");
			showDenominatorsOfNumber(i);
		}
	}

}
