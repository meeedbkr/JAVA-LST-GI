package exo1;

import java.util.Scanner;

public class Factorial {

	public static long factorial(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long fact;
		int n;
		do {
			System.out.println("Entrer un nombre N >=0 ");
			n = sc.nextInt();
		} while (n < 0);
		fact = factorial(n);
		System.out.println(n+"! = "+fact);
	}

}
