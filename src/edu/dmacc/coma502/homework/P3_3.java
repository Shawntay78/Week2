package edu.dmacc.coma502.homework;

import java.util.Scanner;

public class P3_3 {

	static final int TEN_BILLION = 1000000000;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter number between 1 - %d: ", Integer.MAX_VALUE);
		int receivedNumber = scanner.nextInt();
		int numberOfDigits;
		
		if(receivedNumber/10 == 0) {
			numberOfDigits = 1;
		} else if(receivedNumber/100 == 0) {
			numberOfDigits = 2;
		} else if(receivedNumber/1000 == 0) {
			numberOfDigits = 3;
		} else if(receivedNumber/10000 == 0) {
			numberOfDigits = 4;
		} else if(receivedNumber/100000 == 0) {
			numberOfDigits = 5;
		} else if(receivedNumber/1000000 == 0) {
			numberOfDigits = 6;
		} else if(receivedNumber/10000000 == 0) {
			numberOfDigits = 7;
		} else if(receivedNumber/100000000 == 0) {
			numberOfDigits = 8;
		} else if(receivedNumber/1000000000 == 0) {
			numberOfDigits = 9;
		} else {
			numberOfDigits = 10;			
		}
		
		// Display results to user
		System.out.println("");
		System.out.println("---Results---");
		System.out.printf("Your input had %d digits\n", numberOfDigits);
		scanner.close();
	}
}
