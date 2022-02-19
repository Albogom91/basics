package com.belhard.basics.branching;
import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.MathOperations;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("You will be asked to input four numbers to solve the following statement: ");
		System.out.println("max{min(a, b), min(c, d)}");
		double firstNum = ConsoleReader.getDoubleType(in);
		double secondNum = ConsoleReader.getDoubleType(in);
		double thirdNum = ConsoleReader.getDoubleType(in);
		double fourthNum = ConsoleReader.getDoubleType(in);
		in.close();
		
		double minimalOfFirstAndSecond = MathOperations.getMinimalValueOfTwoNumbers(firstNum, secondNum);
		double minimalOfThirdAndFourth = MathOperations.getMinimalValueOfTwoNumbers(thirdNum, fourthNum);
		
		double maximalOfTwoMinimals = MathOperations.getMaximalValueOfTwoNumbers(minimalOfFirstAndSecond, minimalOfThirdAndFourth);		
		
		System.out.println("Solution of the aforementions statement is: " + maximalOfTwoMinimals);
		
	}

}
