package edu.dmacc.coma502.homework;

import java.util.Scanner;

public class P3_21 {

	/*
	 * • 1 percent on the first $50,000. 
	 * • 2 percent on the amount over $50,000 up to $75,000. 
	 * • 3 percent on the amount over $75,000 up to $100,000. 
	 * • 4 percent on the amount over $100,000 up to $250,000. 
	 * • 5 percent on the amount over $250,000 up to $500,000. 
	 * • 6 percent on the amount over $500,000.
	 */
	static final double BRACKET_ONE_RATE = 0.01;
	static final double BRACKET_TWO_RATE = 0.02;
	static final double BRACKET_THREE_RATE = 0.03;
	static final double BRACKET_FOUR_RATE = 0.04;
	static final double BRACKET_FIVE_RATE = 0.05;
	static final double BRACKET_SIX_RATE = 0.06;

	static final int BRACKET_ONE_CAP = 50000;
	static final int BRACKET_TWO_CAP = 75000;
	static final int BRACKET_THREE_CAP = 100000;
	static final int BRACKET_FOUR_CAP = 250000;
	static final int BRACKET_FIVE_CAP = 500000;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your income: ");
		final double income = scanner.nextDouble();

		double tier6Income = 0;//Math.max(income - BRACKET_FIVE_CAP, 0.0);
		if(income - BRACKET_FIVE_CAP > 0) {
			tier6Income = income - BRACKET_FIVE_CAP;
		}
		double tier6Taxes = tier6Income * BRACKET_SIX_RATE;
		
		double remainingIncome = income - tier6Income;
		
		double tier5Income = 0;//Math.max(remainingIncome - BRACKET_FOUR_CAP, 0.0);
		if(remainingIncome - BRACKET_FOUR_CAP > 0) {
			tier5Income = remainingIncome - BRACKET_FOUR_CAP;
		}
		double tier5Taxes = tier5Income * BRACKET_FIVE_RATE;
		
		remainingIncome -= tier5Income;
		
		double tier4Income = 0;//Math.max(remainingIncome - BRACKET_THREE_CAP, 0.0);
		if(remainingIncome - BRACKET_THREE_CAP > 0) {
			tier4Income = remainingIncome - BRACKET_THREE_CAP;
		}
		double tier4Taxes = tier4Income * BRACKET_FOUR_RATE;
		
		remainingIncome -= tier4Income;
		
		double tier3Income = 0;//Math.max(remainingIncome - BRACKET_TWO_CAP, 0.0);
		if(remainingIncome - BRACKET_TWO_CAP > 0) {
			tier3Income = remainingIncome - BRACKET_TWO_CAP;
		}
		double tier3Taxes = tier3Income * BRACKET_THREE_RATE;
		
		remainingIncome -= tier3Income;
		
		double tier2Income = 0;//Math.max(remainingIncome - BRACKET_ONE_CAP, 0.0);
		if(remainingIncome - BRACKET_ONE_CAP > 0) {
			tier2Income = remainingIncome - BRACKET_ONE_CAP;
		}
		double tier2Taxes = tier2Income * BRACKET_TWO_RATE;
		
		remainingIncome -= tier2Income;
		
		double tier1Taxes = remainingIncome * BRACKET_ONE_RATE;

		double calculatedTax = tier1Taxes + tier2Taxes + tier3Taxes
				+ tier4Taxes + tier5Taxes + tier6Taxes;

		// Display results to user
		System.out.println("");
		System.out.println("---Results---");
		System.out.printf("You owe $%.2f in taxes\n", calculatedTax);

		scanner.close();
	}
}
