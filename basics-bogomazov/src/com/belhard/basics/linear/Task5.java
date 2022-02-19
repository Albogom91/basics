package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input value of two angles in degrees to solve the following equation:");
		System.out.println("(sinx + cosy)/(cosx - siny)*tg(x*y)");
		double firstAngle = ConsoleReader.getDoubleType(in);
		double secondAngle = ConsoleReader.getDoubleType(in);
		in.close();
		
		double thirdAngle = Math.toRadians(getValueOfThirdAngle(firstAngle, secondAngle));
		firstAngle = Math.toRadians(firstAngle);
		secondAngle = Math.toRadians(secondAngle);
		
		double result = solveEquation(firstAngle, secondAngle, thirdAngle);
		
		System.out.println("Equation result (using aforementioned values of angles) is: " + result);

	}
	
	public static double solveEquation(double x, double y, double z) {
		double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(z);
		return result;
	}
	
	public static double getValueOfThirdAngle(double x, double y) {
		return x * y;
	}

}
