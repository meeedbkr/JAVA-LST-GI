package exo1;

import java.util.Scanner;

public class Factorial {

	public static long calculateFactorial(int number) {
		long factorial = 1;
		
		// Calculate factorial using a for loop
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		
		return factorial;
	}

	public static void main(String[] args) {
		
		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		
		long factorialResult;
		int number;
		
		// Ask the user to enter a non-negative integer
		do {
			System.out.println("Enter a non-negative integer: ");
			number = scanner.nextInt();
		} while (number < 0);
		
		// Calculate the factorial of the entered number
		factorialResult = calculateFactorial(number);
		
		// Display the result
		System.out.println(number + "! = " + factorialResult);
		scanner.close();
	}
	

}
