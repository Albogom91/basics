package com.belhard.basics.onedimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.ConsoleReader;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input amount of numbers in your sequence (positive integer).");
		int arrayLength = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(arrayLength);
		in.close();

		int RANDOM_LW_LIMIT = 0;
		int RANDOM_UP_LIMIT = 10;
		int[] array = ArrayMethods.fillOneDimArrayRandom(arrayLength, RANDOM_LW_LIMIT, RANDOM_UP_LIMIT);
		ArrayMethods.showOneDimArray(array);

		String sequenceClear = convertArrayToClearString(array);
		
		System.out.println("Your numerical sequence is: " + sequenceClear + ".");

		int minValueOfElement = ArrayMethods.getMinimalValueInArray(array);

		System.out.println("Minimal value of element in the sequence is: " + minValueOfElement);

		int countOfMinValue = ArrayMethods.countInstancesOfElementInArray(minValueOfElement, array);
		
		System.out.println("Number of times minimal value is encountered in the sequence is: " + countOfMinValue);

		int[] modifiedArray = deleteMinValueInArray(minValueOfElement, countOfMinValue, array);
		
		String modifiedSequenceClear = convertArrayToClearString(modifiedArray);
		
		System.out.println("Your modified numerical sequence (excluding elements with minimal value) is: "
				+ modifiedSequenceClear + ".");

	}
	
	public static int[] deleteMinValueInArray(int value, int countOfValue, int[] array) {
		int[] modifiedArray = new int[array.length - countOfValue];
		for (int i = 0, j = 0; i < modifiedArray.length; j++) {
			if (array[j] == value) {
				continue;
			}
			else {
				modifiedArray[i] = array[j];
				i++;
			}
		}
		return modifiedArray;
		}
	
	public static String convertArrayToClearString(int[] array) {
		String sequence = Arrays.toString(array);
		String modifiedSequence = sequence.substring(1, sequence.length() - 1);
		return modifiedSequence;
	}
	
	}


