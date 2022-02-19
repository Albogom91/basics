package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.ConsoleReader;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input two numbers.");
		System.out.println("Following application will show common digits in two numbers.");

		int firstNumber = (int) ConsoleReader.getDoubleType(in);
		int secondNumber = (int) ConsoleReader.getDoubleType(in);
		in.close();

		String commonDigits = getCommonDigits(firstNumber, secondNumber);
		int[] arrayOfDigits = stringToIntArray(commonDigits);
		ArrayMethods.sortByShell(arrayOfDigits);
		int numOfUnique = getNumberOfUniqueElements(arrayOfDigits);
		int[] modifiedArrayOfDigits = deleteRepeatNumberInArray(arrayOfDigits, numOfUnique);
		
		System.out.print("Common digits are: ");
		ArrayMethods.showOneDimArray(modifiedArrayOfDigits);
		
	}
	
	public static String getCommonDigits(int number1, int number2) {
		StringBuilder strBuildCommonNum = new StringBuilder();
		int temp;
		for (int i = number1; i > 0; i /= 10) {
			temp = i % 10;
			for (int j = number2; j > 0; j /= 10) {
				if (temp == j % 10) {
					strBuildCommonNum = strBuildCommonNum.append(temp);
				}
			}
		}
		String commonNumStr = strBuildCommonNum.toString();
		return commonNumStr;
	}
	
	public static int[] stringToIntArray(String str) {
		char[] CharArray = str.toCharArray();
		int[] IntArray = new int[CharArray.length];
		for (int i = 0; i < IntArray.length; i++) {
			IntArray[i] = Character.getNumericValue(CharArray[i]);
		}
		return IntArray;
	}
	
	public static int getNumberOfUniqueElements(int[] array) {
		int numOfUnique = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				continue;
			}
		numOfUnique++;
		}
		return numOfUnique;
	}
	
	public static int[] deleteRepeatNumberInArray(int[] array, int numOfUnique) {
		int[] newArray = new int[numOfUnique];
		newArray[0] = array[0];
		for (int i = 1, j = 1; i < array.length; i++){
			if (array[i] == array[i - 1]) {
				continue;
			}
			newArray[j++] = array[i];
		}
		return newArray;
	}

}
