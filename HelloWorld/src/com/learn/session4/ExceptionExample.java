package com.learn.session4;

public class ExceptionExample {

	public static void main(String[] args) {
		int result = divide(100, 10);
		System.out.println(result);

		result++;

		System.out.println(result);
	}

	public static int divide(int a, int b) throws ArithmeticException {
		int result = 0;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		} finally {
			System.out.println("This is finally block.");
		}
		return result;
	}

}
