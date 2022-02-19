package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.exceptions.IllegalNumberException;
import com.belhard.basics.util.ConsoleReader;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input three digit number (> 100 and < 1000) with 3 decimal places.");
		System.out.println("If there are more than 3 decimal places those extra decimal places will be cut.");
		double threeDecimalDouble = ConsoleReader.getDoubleType(in);
		in.close();
		
		try {
			if (threeDecimalDouble > 1000 || threeDecimalDouble < 100) {
				throw new IllegalNumberException();
			}
		}catch(Exception e) {
			System.out.println("Not a three digit number! Exiting application!");
			return;
		}

		threeDecimalDouble = roundToThreeDecimalPlaces(threeDecimalDouble);
		double swappedThreeDecimalDouble = swapIntegerAndDecimalParts(threeDecimalDouble);

		System.out.println("Your number with swapped integer and decimal parts is: " + swappedThreeDecimalDouble);

	}

	public static double roundToThreeDecimalPlaces(double source) {
		String strSource = String.valueOf(source);
		String modifiedStrSource = strSource.substring(0, 7);
		double newSource = Double.parseDouble(modifiedStrSource);
		return newSource;
	}

	public static double swapIntegerAndDecimalParts(double source) {
		double intPart = (int) source;
		double decPart = Math.round((source - intPart) * 1000);
		intPart /= 1000;
		double swappedSource = intPart + decPart;
		return swappedSource;
	}
}
