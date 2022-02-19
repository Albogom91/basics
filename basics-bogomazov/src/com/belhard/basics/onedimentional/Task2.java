package com.belhard.basics.onedimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.ConsoleReader;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input amount of numbers in your array (positive integer).");
		int arrayLength = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(arrayLength);
		in.close();
		
		int RANDOM_LW_LIMIT = -10;
		int RANDOM_UP_LIMIT = 10;
		double[] array = ArrayMethods.fillOneDimArrayDoubleRandom(arrayLength, RANDOM_LW_LIMIT, RANDOM_UP_LIMIT);
		ArrayMethods.showOneDimArrayDouble(array);

		int[] resultArray = countPosNegZeroElemInArray(array);
		showResult(resultArray);
		
	}
	
	public static int[] countPosNegZeroElemInArray(double[] array) {
		int numOfPositive = 0;
		int numOfNegative = 0;
		int numOfZero = 0;
		int[] resultArray = new int[3];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				numOfPositive++;
			} else if (array[i] < 0) {
				numOfNegative++;
			} else {
				numOfZero++;
			}
		}
		resultArray[0] = numOfPositive;
		resultArray[1] = numOfNegative;
		resultArray[2] = numOfZero;
		return resultArray;
	}
	
	public static void showResult(int[] array) {
		System.out.println("Number of positive array elements is " + array[0]);
		System.out.println("Number of negative array elements is " + array[1]);
		System.out.println("Number of array elements equal to 0 is " + array[2]);
	}

}
