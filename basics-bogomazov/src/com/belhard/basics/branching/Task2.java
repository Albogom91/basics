package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("You will be asked to input x to solve equation: ");
		System.out.println("y=x*x -3x + 9 (if x<=3) and y=1/(x*x*x + 6) (if x>3)");
		double x = ConsoleReader.getDoubleType(in);

		double result = solveEquation(x);

		System.out.println("Solution of the equation if x =" + x + " is: " + result);
	}

	public static double solveEquation(double x) {
		double y;
		if (x <= 3) {
			y = x * x - 3 * x + 9;
		} else {
			y = 1 / (x * x * x + 6);
		}
		return y;
	}

}
