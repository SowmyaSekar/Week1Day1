package week1.day1;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 789;
		int quotient;
		int remainder;
		int sum = 0;
		System.out.println("Digit :" + number);
		while (number != 0) {
			quotient = number / 10;
			remainder = number % 10;
			sum = sum + remainder;
			number = quotient;
			System.out.println("Quotient :" + quotient);
			System.out.println("Remainder :" + remainder);

		}
		System.out.println("Sum of digit " + 789 + " is : " + sum);
	}
}
