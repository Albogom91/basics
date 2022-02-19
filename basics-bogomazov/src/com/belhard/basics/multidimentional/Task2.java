package com.belhard.basics.multidimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.ConsoleReader;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input amount of lines and columns"
				+ "in your two-dimensional array (positive integers).");
		int numOfLines = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(numOfLines);
		int numOfColumns = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(numOfColumns);
		
		int RANDOM_LW_LIMIT = 0;
		int RANDOM_UP_LIMIT = 100;
		int[][] array = ArrayMethods.fillTwoDimArrayRandom(numOfLines, numOfColumns, RANDOM_LW_LIMIT, RANDOM_UP_LIMIT);
		ArrayMethods.showTwoDimArray(array);
		System.out.println();

		int choice = chooseSortOrder(in);
		in.close();
		
		switch (choice) {
		case 1:
			ArrayMethods.sortLinesInTwoDimArray(array);
			ArrayMethods.showTwoDimArray(array);
			break;
		case 2:
			ArrayMethods.sortLinesInTwoDimArrayReverse(array);
			ArrayMethods.showTwoDimArray(array);
			break;
		default:
			System.out.println("Ivalid input!");
			break;
		}
	}
	
	public static int chooseSortOrder(Scanner scan) {
		System.out.print("Sort lines of array (enter 1 for ascending order; enter 2 for descending order): ");
		int choice;
		if (scan.hasNextInt()) {
			choice = scan.nextInt();
			if (choice < 1 || choice > 2) {
				System.out.println("Invalid input!");
				System.exit(0);
				return 0;
			}
		} else {
			System.out.println("Invalid input!");
			System.exit(0);
			return 0;
		}
		return choice;
	}
	
}
