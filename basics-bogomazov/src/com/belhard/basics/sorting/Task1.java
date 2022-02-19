package com.belhard.basics.sorting;

import com.belhard.basics.util.ArrayMethods;
import com.belhard.basics.util.TimeMethods;

public class Task1 {

	public static void main(String[] args) {
				
		int ARRAY_SIZE = 100;
		int RANDOM_LW_LIMIT = 0;
		int RANDOM_UP_LIMIT = 100;
		int[] array = ArrayMethods.fillOneDimArrayRandom(ARRAY_SIZE, RANDOM_LW_LIMIT, RANDOM_UP_LIMIT);
		ArrayMethods.showOneDimArray(array);
		
		long startTime = System.nanoTime();
		ArrayMethods.sortBubble(array);
		long endTime = System.nanoTime();
		
		long runTime = TimeMethods.getRunTime(startTime, endTime);
		
		System.out.println("Bubble sort:");
		ArrayMethods.showOneDimArray(array);
		
		System.out.println();
		System.out.println("Sorting time: " + runTime + " ns");

	}
}
