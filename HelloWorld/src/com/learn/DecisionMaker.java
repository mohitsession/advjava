package com.learn;

public class DecisionMaker {

	public static void main(String[] args) {

		// If conditional statment
		int score = 91;
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}

		System.out.println("Grade is " + grade);

		// Switch conditional statment
		int dayOfWeek = 1;
		String dayName ="";
//		if(dayOfWeek == 1) {
//			dayName = "Sunday";
//		}

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
		System.out.println("Day of Week : " + dayName);
	}

}
