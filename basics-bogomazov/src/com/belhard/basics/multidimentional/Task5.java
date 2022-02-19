package com.belhard.basics.multidimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.ConsoleReader;

public class Task5 {

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
		
		sortAllColumnsInTwoDimArray(array);
		
		System.out.println();
		System.out.println("Columns in ascending order.");
		ArrayMethods.showTwoDimArray(array);
		
		sortPrevSortedAllColumnsInTwoDimArrayReverse(array);
		
		System.out.println();
		System.out.println("Columns in descending order.");
		ArrayMethods.showTwoDimArray(array);

	}
	
	public static int[][] sortColumnInTwoDimArray(int[][] array, int column) {
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i][column];
		}
		ArrayMethods.sortByShell(newArray);
		for (int i = 0; i < array.length; i++) {
			array[i][column] = newArray[i];
		}
		return array;
	}
	
	public static int[][] sortPrevSortedColumnInTwoDimArrayReverse(int[][] array, int column) {
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i][column];
		}
		ArrayMethods.reverseArray(newArray);
		for (int i = 0; i < array.length; i++) {
			array[i][column] = newArray[i];
		}
		return array;
	}
	
	public static int[][] sortAllColumnsInTwoDimArray(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			sortColumnInTwoDimArray(array, i);
		}
		return array;
	}
	
	public static int[][] sortPrevSortedAllColumnsInTwoDimArrayReverse(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			sortPrevSortedColumnInTwoDimArrayReverse(array, i);
		}
		return array;
	}

}
