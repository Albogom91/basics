package com.belhard.basics.cycles;
import java.math.*;

public class Task5 {

	public static void main(String[] args) {
		System.out.println("Following aplication shows product of first 200 square numbers.");
		int UPPER_RANGE = 200;
		BigInteger result = productOfNumbersFromOneToNumber(UPPER_RANGE);
		System.out.println("Result is: " + result);
		
	}
	
	public static BigInteger productOfNumbersFromOneToNumber(int number) {
		BigInteger prod = new BigInteger("1");
		BigInteger temp;
		for (long i = 2; i <= number; i++) {
			temp = BigInteger.valueOf(i * i);
			prod = prod.multiply(temp);
			
		}
		return prod;
	}

}
