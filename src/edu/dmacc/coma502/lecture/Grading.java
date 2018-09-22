package edu.dmacc.coma502.lecture;

public class Grading {

	public static void main(String[] args) {

		/*
		 * 90 - 100 = A 80 - 89 = B 70 - 79 = C 60 - 69 = D 0 - 59 = F
		 */
		int grade = 99;

		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		if (grade == 100) {
			System.out.println("A+");
		} else if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("C");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		boolean result = false;
		if(!result) {
			System.out.println("True branch");
		} else {
			System.out.println("False branch");
		}
		
		
		String name = "John";
		String name2 = "";
		if (name != null) {
			name2 = name.substring(0,4);
		}
		String answer = null;
		
		if("Yes".equals(answer)) {
			System.out.println("Yes");
		}
		
		if (name.equals(name2)) {
			System.out.println("The names are the same");
		} else {
			System.out.println("name2: " + name2);
		}
		
		

		System.out.println("Exit");
	}

}
