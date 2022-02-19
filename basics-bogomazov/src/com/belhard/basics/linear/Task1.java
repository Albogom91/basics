package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input three numbers to solve the following equation: ");
		System.out.println("z = ( (a – 3 ) * b / 2) + c");
		double firstVariable = ConsoleReader.getDoubleType(in);
		double secondVariable = ConsoleReader.getDoubleType(in);
		double thirdVariable = ConsoleReader.getDoubleType(in);
		in.close();

		double result = solveEquation(firstVariable, secondVariable, thirdVariable);

		System.out.println("Equation result (using aforementioned variables) is: " + result);
	}

	public static double solveEquation(double firstVariable, double secondVariable, double thirdVariable) {
		double result = ((firstVariable - 3) * secondVariable / 2) + thirdVariable;
		return result;
	}

}
