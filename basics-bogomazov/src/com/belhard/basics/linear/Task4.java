package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input three numbers to solve equation:");
		System.out.println("(b + sqrt(b*b + 4ac)) / 2a - a*a*a*c + 1/c*c");
		double firstVariable = ConsoleReader.getDoubleType(in);
		double secondVariable = ConsoleReader.getDoubleType(in);
		double thirdVariable = ConsoleReader.getDoubleType(in);
		in.close();
		double result = solveEquation(firstVariable, secondVariable, thirdVariable);
		
		System.out.println("Equation result (using aforementioned variables) is: " + result);

	}

	public static double solveEquation(double a, double b, double c) {
		double result = (b + Math.sqrt(b * b + 4 * a * c)) / 2 / a - a * a * a * c + Math.pow(b, -2);
		return result;
	}

}
