package edu.dmacc.coma502.homework;

import java.util.Scanner;

public class P3_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter first of three numbers: ");
		int firstInput = scanner.nextInt();
		System.out.printf("Enter second of three numbers: ");
		int secondInput = scanner.nextInt();
		System.out.printf("Enter third of three numbers: ");
		int thirdInput = scanner.nextInt();
		
		String orderedResponse;
		if (firstInput <= secondInput && secondInput <= thirdInput) {
			orderedResponse = "in order";
		} else if(thirdInput <= secondInput && secondInput <= firstInput) {
			orderedResponse = "in order";
		} else {
			orderedResponse = "not in order";
		}
		
		// Display results to user
		System.out.println("");
		System.out.println("---Results---");
		System.out.printf("Your input was %s\n", orderedResponse);
		scanner.close();
	}

}
