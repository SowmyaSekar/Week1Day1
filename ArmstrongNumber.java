package week1.day1.assignments;

public class ArmstrongNumber {
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153 output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a While loop, type 'while' followed by: ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input

		int number = 122;

		// Declare 3 more int variables as calculated, remainder, original (Tip:
		// Initialize calculated alone)

		int remainder, quotient, original;
		int calculated = 0;
		int sum = 0;

		// Assign input into variable original

		original = number;

		// Use loop to calculate: use while loop to set condition until the number
		// greater than 0

		while (number > 0) {

			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

			remainder = number % 10;

			// Within loop: get the quotient when done by 10 (Tip: Assign the result to
			// input)

			quotient = number / 10;
			number = quotient;
			// Within loop: Add calculated with the cube of remainder & assign it to
			// calculated

			calculated = (remainder * remainder * remainder);

			sum = sum + calculated;
			// Check whether calculated and original are same
		}
		System.out.println("Calculated Value:" + sum);
		System.out.println("Original Value: " + original);

		if (sum == original) {
			System.out.println(sum + " equals " + original);
			System.out.println("It is an Armstrong Number");
		} else {
			System.out.println("It is not an Armstrong Number");
		}
		// When it matches print it as Armstrong number

	}

}
