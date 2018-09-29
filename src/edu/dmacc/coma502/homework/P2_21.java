package edu.dmacc.coma502.homework;

import java.util.Scanner;

public class P2_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = scanner.nextInt();

		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int monthOfYear = (h - m + r + 90) / 25;
		int dayOfMonth = (h - m + r + monthOfYear + 19) % 32;

		// Display results to user
		System.out.println("");
		System.out.println("---Results---");
		System.out.printf("In %d Easter was on %02d/%02d\n", year, monthOfYear,
				dayOfMonth);

		scanner.close();
	}
}
