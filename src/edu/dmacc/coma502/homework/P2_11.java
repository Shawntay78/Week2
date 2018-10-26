package edu.dmacc.coma502.homework;

import java.util.Scanner;

public class P2_11 {

	static final int ONE_HUNDRED_MILES = 100;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Collect user input
		System.out.print("Enter # of gallons in the tank: ");
		double gallonInTank = scanner.nextDouble();
		System.out.print("Enter fuel efficiency in miles/gal: ");
		double milesPerGallon = scanner.nextDouble();
		System.out.print("Enter price of gas per gallon: ");
		double priceOfGas = scanner.nextDouble();

		double gallonsPerMile = 1 / milesPerGallon;
		double costPerHundredMiles = gallonsPerMile * ONE_HUNDRED_MILES
				* priceOfGas;
		double milesPerTank = milesPerGallon * gallonInTank;

		//Display results to user
		System.out.println("");
		System.out.println("---Results---");
		System.out.printf("It costs $%.2f to drive 100 miles\n",
				costPerHundredMiles);
		System.out.printf("You can drive %.0f miles on this tank\n",
				milesPerTank);

		scanner.close();
	}
}
// We all love Git!
// another comment
