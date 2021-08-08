package week1.day1.assignments;

public class Factorial {

	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5 output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input as 5
		int input = 5;

		// Declare an integer variable fact as 1
		int fact = 1;

		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 1; i <= 5; i++) {
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
			// the 'fact' variable)
			fact = fact * i;
		}

		// End of loop
		System.out.println("Factorial of " + input + " is: " + fact);

		// Print factorial (fact)

	}
}