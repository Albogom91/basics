package com.belhard.basics.util;

import java.util.Random;

public class ArrayMethods {

	public static void main(String[] args) {

	}

	public static void checkArrayLength(int length) {
		if (length <= 0) {
			System.out.println("Invalid input!");
			System.exit(0);
		}
	}

	public static int[] fillOneDimArrayRandom(int length, int lowerLimit, int upperLimit) {
		int[] array = new int[length];
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			array[i] = lowerLimit + random.nextInt(upperLimit - lowerLimit);
		}
		return array;
	}
	
	public static int[] reverseArray(int[] array) {
		int[] reverseArray = new int[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			reverseArray[j] = array[i];
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = reverseArray[i];
		}
		return array;
	}
	
	public static int[][] fillTwoDimArrayRandom(int lines, int columns, int lowerLimit, int upperLimit) {
		int[][] array = new int[lines][columns];
		Random random = new Random();
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = lowerLimit + random.nextInt(upperLimit - lowerLimit);
			}
		}
		return array;
	}
	
	public static double[] fillOneDimArrayDoubleRandom(int length, int lowerLimit, int upperLimit) {
		double[] array = new double[length];
		for (int i = 0; i < length; i++) {
			array[i] = Math.random() * (upperLimit - lowerLimit) + lowerLimit;
		}
		return array;
	}
	
	public static double[][] fillTwoDimArrayDoubleRandom(int lines, int columns, int lowerLimit, int upperLimit) {
		double[][] array = new double[lines][columns];
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = Math.random() * (upperLimit - lowerLimit) + lowerLimit;
			}
		}
		return array;
	}

	public static void showOneDimArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void showTwoDimArray(int[][] array) {
		System.out.println("Your two-dimensional array:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] / 10 < 1) {
					System.out.print(" " + array[i][j] + " ");
				} else {
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void showOneDimArrayDouble(double[] array) {
		for (double element : array) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}
	
	public static void showTwoDimArrayDouble(double[][] array) {
		System.out.println("Your two-dimensional array (formatted to display only 10 decimal places):");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%.10f", array[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static int getMinimalValueInArray(int[] array) {
		int minValueOfElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValueOfElement) {
				minValueOfElement = array[i];
			}
		}
		return minValueOfElement;
	}
	
	public static int countInstancesOfElementInArray(int value, int[] array) {
		int countOfValue = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				countOfValue++;
			}
		}
		return countOfValue;
	}
	
	public static int[] sortByShell(int[] array) {
		int temp = array[0];
		int tempIndex = 0;
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				temp = array[i];
				tempIndex = i;
				while (tempIndex >= gap) {
					if (temp < array[tempIndex - gap]) {
						array[tempIndex] = array[tempIndex - gap];
						tempIndex -= gap;
					} else {
						break;
					}
				}
				array[tempIndex] = temp;
			}
		}
		return array;
	}
	
	public static int[] sortBubble(int[] array) {
		int temp = 0;
		int size = array.length;
		for (int i = 0; i < array.length; i++, size--) {
			for (int j = 1; j < size; j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] sortInsertion(int[] array) {
		int temp = array[0];
		int tempIndex = 0;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			tempIndex = i;
			while (tempIndex > 0) {
				if (temp < array[tempIndex - 1]) {
					array[tempIndex] = array[tempIndex - 1];
					tempIndex--;
				} else {
					break;
				}
			}
			array[tempIndex] = temp;
		}
		return array;
	}
	
	public static int[][] sortLinesInTwoDimArray(int[][] array){
		for (int i = 0; i < array.length; i++) {
			ArrayMethods.sortByShell(array[i]);
		}
		return array;
	}
	
	public static int[][] sortLinesInTwoDimArrayReverse(int[][] array){
		for (int i = 0; i < array.length; i++) {
			ArrayMethods.sortByShell(array[i]);
			ArrayMethods.reverseArray(array[i]);
		}
		return array;
	}
	
	public static int[] sortQuick(int[] array) {
		int start = 0;
		int end = array.length - 1;
		sortQuickPrePartition(array, start, end);
		return array;
	}
	
	public static void sortQuickPrePartition(int[] array, int start, int end) {
		if(start < end) {
			int partitionIndex = sortQuickPartition(array, start, end);
			sortQuickPrePartition(array, start, partitionIndex - 1);
			sortQuickPrePartition(array, partitionIndex + 1, end);
			
		}
	}
	
	public static int sortQuickPartition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start - 1;
		int temp;
		for(int j = start; j < end; j++) {
			if(array[j] <= pivot) {
				i++;
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		temp = array[end];
		array[end] = array[i + 1];
		array[i + 1] = temp;
		return i + 1;
	}
}
