package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("You will be asked to input value of two angles in degrees ");
		System.out.print("to check if a triangle with such angles can exist and ");
		System.out.println("if it can to check if this triangle is right. ");

		double firstAngle = ConsoleReader.getDoubleType(in);
		double secondAngle = ConsoleReader.getDoubleType(in);
		in.close();

		boolean isExistingTriangle = checkIfTrinagleDoesExist(firstAngle, secondAngle);
		boolean isRightTriangle = checkIfTrinagleIsRight(firstAngle, secondAngle);

		showResult(isExistingTriangle, isRightTriangle);

	}

	public static boolean checkIfTrinagleDoesExist(double angle1, double angle2) {
		if (angle1 + angle2 >= 180 || angle1 <= 0 || angle2 <= 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean checkIfTrinagleIsRight(double angle1, double angle2) {
		if (!checkIfTrinagleDoesExist(angle1, angle2)) {
			System.out.println("Not a triangle! Check your angles.");
			return false;
		}
		if (angle1 == 90 || angle2 == 90 || angle1 + angle2 == 90) {
			return true;
		} else {
			return false;
		}
	}

	public static void showResult(boolean isTriangle, boolean isRightTriangle) {
		if (isTriangle && isRightTriangle) {
			System.out.println("Triangle DOES EXIST and it is RIGHT triangle.");
		} else {
			if (isTriangle) {
				System.out.println("Triangle DOES EXIST.");
			} else {
				System.out.println("Triangle DOES NOT EXIST.");
			}
		}
	}

}
