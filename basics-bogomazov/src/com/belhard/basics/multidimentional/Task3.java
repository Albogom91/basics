package com.belhard.basics.multidimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.ConsoleReader;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input amount of lines and columns"
				+ "in your two-dimensional array (positive integers).");
		int numOfLines = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(numOfLines);
		int numOfColumns = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(numOfColumns);
		
		int RANDOM_LW_LIMIT = 10;
		int RANDOM_UP_LIMIT = 100;
		double[][] array = ArrayMethods.fillTwoDimArrayDoubleRandom(numOfLines, numOfColumns, RANDOM_LW_LIMIT, RANDOM_UP_LIMIT);
		ArrayMethods.showTwoDimArrayDouble(array);
		in.close();
		
		System.out.println();

		double maxSum = getMaxSumInColumns(array);
		int maxSumColumnIndex = getIndexOfMaxSumInColumns(array);
		System.out.print("Maximal sum of elements is " + maxSum + " and it is located in the " + maxSumColumnIndex + " column.");
	}
	
	public static double getMaxSumInColumns(double[][] array) {
		double sum = 0.0;
		double maxSum = 0.0;
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum += array[j][i];
			}
			if (sum > maxSum) {
				maxSum = sum;
				sum = 0.0;
			} else {
				sum = 0.0;
			}
		}
		return maxSum;
	}
	
	public static int getIndexOfMaxSumInColumns(double[][] array) {
		double sum = 0.0;
		int maxSumColumnIndex = 0;
		double maxSum = 0.0;
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum += array[j][i];
			}
			if (sum > maxSum) {
				maxSum = sum;
				maxSumColumnIndex = i;
				sum = 0.0;
			} else {
				sum = 0.0;
			}
		}
		return maxSumColumnIndex;
	}
	
}
