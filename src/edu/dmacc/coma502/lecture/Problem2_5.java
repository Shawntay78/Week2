package edu.dmacc.coma502.lecture;

import java.util.Scanner;

public class Problem2_5 {
	static final double PI = 3.14;

	public static void main(String[] args) {
/*
 Х	The product 
 Х	The average 
 Х	The distance (absolute value of the difference) 
 Х	The maximum (the larger of the two) 
 Х	The minimum (the smaller of the two)
Hint: The max and min functions are declared in the Math class. Enhance the output of Exercise P2.4 so that the numbers are properly aligned:
Sum:ннннннннннннн45 Difference:нннннн-5 Product:нннннннн500 Average:ннннннннн22.50 Distance:ннннннннн5 Maximum:ннннннннн25 Minimum:ннннннннн20
 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int firstValue = scanner.nextInt();
		System.out.print("Enter second value: ");
		int secondValue = scanner.nextInt();

		int sum = firstValue + secondValue;
		int diff = firstValue - secondValue;
		int product = firstValue * secondValue;
		double average = (sum) / 2.0;
		int distance = Math.abs(diff);
		int min = Math.min(firstValue, secondValue);
		int max = Math.max(firstValue, secondValue);
		
		
		System.out.println("Sum: " + sum);
		System.out.println("diff: " + diff);
		System.out.println("product: " + product);
		System.out.println("average: " + average);
		System.out.println("distance: " + distance);
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		
		scanner.close();

	}

}
