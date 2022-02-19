package com.belhard.basics.multidimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.ConsoleReader;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input amount of lines and columns"
				+ "in your two-dimensional array (positive integers).");
		int numOfLines = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(numOfLines);
		int numOfColumns = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(numOfColumns);
		in.close();
		
		int RANDOM_LW_LIMIT = 0;
		int RANDOM_UP_LIMIT = 100;
		int[][] array = ArrayMethods.fillTwoDimArrayRandom(numOfLines, numOfColumns, RANDOM_LW_LIMIT, RANDOM_UP_LIMIT);
		ArrayMethods.showTwoDimArray(array);
		
		int START_COLUMN = 1;
		int COLUMN_STEP = 2;
		System.out.println("Odd columns (starting from zero) in which first element is larger than last: ");
		showColumnsFirstElemLargerThanLast(array, START_COLUMN, COLUMN_STEP);

	}
	
	public static void showColumnsFirstElemLargerThanLast(int[][] array, int lowerRange, int step) {
		for (int i = lowerRange; i < array[0].length; i += step) {
			if (array[0][i] > array[array.length - 1][i]) {
				for (int j = 0; j < array.length; j++) {
					System.out.println(array[j][i]);
				}
				System.out.println();
			}
		}
	}

}
