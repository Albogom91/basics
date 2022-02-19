package com.belhard.basics.multidimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.ConsoleReader;

public class Task6 {

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

		System.out.print("You will be asked to input numbers of two columns (starting from zero) ");
		System.out.println("in your two-dimensional array. These columns numbers should not be the same.");
		
		int switchColumn1 = chooseColumns(in);
		checkColumn(switchColumn1, numOfColumns);
		int switchColumn2 = chooseColumns(in);
		checkColumn(switchColumn2, numOfColumns);
		if (switchColumn2 == switchColumn1) {
			System.out.println("Invalid input!");
			return;
		}
		in.close();

		switchColumnsInTwoDimArray(array, switchColumn1, switchColumn2);

		System.out.println("Array with switched columns " + switchColumn1 + " and " + switchColumn2 + ":");
		ArrayMethods.showTwoDimArray(array);

	}
	
	public static int[][] switchColumnsInTwoDimArray(int[][] array, int switchColumn1, int switchColumn2){
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			temp = array[i][switchColumn1];
			array[i][switchColumn1] = array[i][switchColumn2];
			array[i][switchColumn2] = temp;
		}
		return array;
	}

	public static int chooseColumns(Scanner scan) {
		System.out.print("Select column (starting from zero): ");
		int choice;
		if (scan.hasNextInt()) {
			choice = scan.nextInt();
		} else {
			System.out.println("Invalid input!");
			System.exit(0);
			return 0;
		}
		return choice;
	}

	public static void checkColumn(int column, int numOfColumns) {
		if (column < 0 || column >= numOfColumns) {
			System.out.println("Invalid input!");
			System.exit(0);
			return;
		}
	}
}
