package com.belhard.basics.util;

import java.util.Scanner;
import com.belhard.basics.exceptions.*;

public class ConsoleReader {

	public static double getDoubleType(Scanner scan) {
		System.out.print("Please, input your number: ");
		double number = 0.0;
		try {
			if (!scan.hasNextDouble()) {
				throw new IllegalDataTypeException();
			}
			number = scan.nextDouble();
		} catch (Exception e) {
			scan.next();
			System.out.println("Invalid data type(number was expected)!");
			System.out.print("Press 1 to try again;" + " press 2 to use default value of variable (0,0); press 3 to stop application: ");
			int menuChoice = getDoubleTypeMenuChoice(scan);
			switch (menuChoice) {
			case 1:
				number = getDoubleType(scan);
				break;
			case 2:
				System.out.println("Set default value");
				return 0.0;
			case 3:
				System.out.println("Exiting application.");
				System.exit(0);
				return 0.0;
			default:
				System.out.println("Invalid input! Exiting application.");
				System.exit(0);
				return 0.0;
			}
		}
		return number;
	}

	public static int getDoubleTypeMenuChoice(Scanner scan) {
		int choice = 0;
		try {
			if (!scan.hasNextInt()) {
				throw new IllegalDataTypeException();
			}
			choice = scan.nextInt();
			if (choice < 1 || choice > 3) {
				throw new IllegalRangeInputException();
			}
		}catch (Exception e) {
			scan.next();
			System.out.println("Invalid input(1, 2 or 3 was expected)!");
			System.out.println("Please, try again:");
			getDoubleTypeMenuChoice(scan);
		}
		return choice;
	}
}
