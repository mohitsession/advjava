package com.learn.session4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
	public static void main(String[] args) {

		try {
			readFileAndVerify();
		} catch (FileNotFoundException e) {
			System.out.println("File Not found");
		} catch (VerificationFailException e) {
			System.out.println("Verification Failed");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
	}

	public static void readFileAndVerify() throws FileNotFoundException, VerificationFailException, ArithmeticException {
//		File file = new File("xyx.docs");
//		Scanner scanner = new Scanner(file);
		// some verification logic it failed
		throw new ArithmeticException();
	}
}

class VerificationFailException extends Exception {

}
