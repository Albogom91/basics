package com.belhard.basics.linear;
import java.util.Scanner;

import com.belhard.basics.exceptions.IllegalNumberException;
import com.belhard.basics.util.ConsoleReader;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You will be asked to enter time in seconds (positive integer).");
		int timeInSeconds = (int) ConsoleReader.getDoubleType(in);
		in.close();
		
		try {
			if (timeInSeconds < 0) {
				throw new IllegalNumberException();
			}
		}catch(Exception e) {
			System.out.println("Invalid time, can't be negative!");
			return;
		}
		
		String formattedTime = convertSecondsToHoursMinutesSeconds(timeInSeconds);
		
		System.out.println(timeInSeconds + " seconds is equal to " + formattedTime);
		

	}
	
	public static String convertSecondsToHoursMinutesSeconds(int timeInSeconds) {
		int hours = timeInSeconds / 3600;
		timeInSeconds %= 3600;
		int minutes = timeInSeconds / 60;		
		int seconds = timeInSeconds % 60;
		String formattedHours = String.format("%02d", hours);
		String formattedMinutes = String.format("%02d", minutes);
		String formattedSeconds = String.format("%02d", seconds);
		String formattedTime = formattedHours + "h " + formattedMinutes + "min " + formattedSeconds + "s";
		return formattedTime;
		
		}
	}


