package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input three numbers.");
		System.out.println("First two will define starting and ending x coordinates of the function interval.");
		System.out.println("Third number will define value of consistent change of x coordinate.");
		System.out.println("Function: y=x+4 (if x > 2) and y=-x*2 (if x<=2)");		

		double lowerRange = ConsoleReader.getDoubleType(in);
		double upperRange = ConsoleReader.getDoubleType(in);
		double step = ConsoleReader.getDoubleType(in);
		in.close();
		
		if (lowerRange >= upperRange || step <= 0) {
			System.out.println("Invalid range and/or step!");
			return;
		}

		showValuesOfFunctionOnTheInterval(lowerRange, upperRange, step);
	}

	public static void showValuesOfFunctionOnTheInterval(double lowerRange, double upperRange, double step) {
		System.out.println("Values of function from x=" + lowerRange + " to x=" + upperRange + " with step " + step + ":");
		for (double i = lowerRange; i <= upperRange; i += step) {
			if (i > 2) {
				System.out.println(i + 4);
			} else {
				System.out.println(-i * 2 + 0); // to erase -0.0 which can be encountered if i = 0
			}
		}
	}

}
