package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to input x and y coordinates to check"
				+ " if these coordinates belong to the graphic.");
		double xCoordinate = ConsoleReader.getDoubleType(in);
		double yCoordinate = ConsoleReader.getDoubleType(in);
		in.close();
		boolean doesBelong = doesBelongToGraphic(xCoordinate, yCoordinate);
		showResult(doesBelong);

	}

	public static boolean doesBelongToGraphic(double x, double y) {
		// For this part I have assumed that borderline values belong to the painted part,
		// if they are not then '=' should be deleted from all statements and y > 0 on
		// the 25th line should look like this y >= 0.
		if (y > 0 && y <= 4) {
			if (x >= -2 && x <= 2) {
				return true;
			} else {
				return false;
			}
		} else {
			if (y >= -3 && y <= 0) {
				if (x >= -4 && x <= 4) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	public static void showResult(boolean doesBelong) {
		if (doesBelong) {
			System.out.println("Your point DOES BELONG to the painted part of the graphic!");
		} else {
			System.out.println("Your point DOES NOT BELONG to the painted part of the graphic!");
		}
	}

}
