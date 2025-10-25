package com.learn;

public class Method {
	public static void main(String[] args) {

		// Switch conditional statment
		int dayOfWeek = 1;
		
		System.out.println("Day of Week : " + getDayName(dayOfWeek));

		System.out.println("Day of Week : " + getDayName(3));
	}
	
	
	private static String getDayName(int dayOfWeek) {
		String dayName ="";
		switch (dayOfWeek) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "MOnday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;
		default:
			System.out.println("Invalid Input");
		}
		return dayName;
	}
	
}
