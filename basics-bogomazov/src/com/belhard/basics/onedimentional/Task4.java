package com.belhard.basics.onedimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.ConsoleReader;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input amount of numbers in your array (positive integer).");
		int arrayLength = (int) ConsoleReader.getDoubleType(in);
		ArrayMethods.checkArrayLength(arrayLength);
		in.close();
		
		int RANDOM_LW_LIMIT = 0;
		int RANDOM_UP_LIMIT = 10;
		int[] array = ArrayMethods.fillOneDimArrayRandom(arrayLength, RANDOM_LW_LIMIT, RANDOM_UP_LIMIT);
		ArrayMethods.showOneDimArray(array);

		int minValueofMode = getMinimalValueOfMode(array);

		System.out.println("Minimal value of mode in the array is: " + minValueofMode);

	}
	
	public static int getMinimalValueOfMode(int[] array) {
		int count = 0;
		int maxCount = 0;
		int minValueofMode = array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				minValueofMode = array[i];
				count = 0;
			} else if (count == maxCount) {
				minValueofMode = array[i] < minValueofMode ? array[i] : minValueofMode;
				count = 0;
			} else {
				count = 0;
			}
		}
		return minValueofMode;
	}

}
