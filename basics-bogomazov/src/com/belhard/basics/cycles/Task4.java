package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.exceptions.IllegalRangeInputException;
import com.belhard.basics.util.ConsoleReader;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input two numbers (from 0 to 127).");
		System.out.println("Following application will show part ASCII table from your first number till second.");
		int lowerRange = (int) ConsoleReader.getDoubleType(in);
		int upperRange = (int) ConsoleReader.getDoubleType(in);
		in.close();
		
		try {
			if (lowerRange < 0 || lowerRange > 127 || upperRange < 0 || upperRange > 127) {
				throw new IllegalRangeInputException();
			}
		}catch(Exception e) {
			System.out.println("Invalid range!");
			return;
		}
		
		showAscii((char) lowerRange, (char) upperRange);
			
	}

	public static void showAscii(char lowerRange, char upperRange) {
		for (char c = lowerRange; c <= upperRange; c++) {			
			System.out.println((int) c + " -> " + c);
		}
	}
}
