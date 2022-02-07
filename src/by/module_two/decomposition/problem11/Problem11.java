package by.module_two.decomposition.problem11;

import java.util.Scanner;

//Написать метод(методы),определяющий, в каком из данных двух чисел больше цифр; 

public class Problem11 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int digitFirstNumber;
		int digitSecondNumber;
		num1 = enterFromConsole("Please, insert first number");
		num2 = enterFromConsole("Please, insert second number");
		digitFirstNumber = digitCounter(num1);
		digitSecondNumber = digitCounter(num2);
		comparisonOfNumbers(digitFirstNumber, digitSecondNumber);
	}

	public static int enterFromConsole(String message) {
		int x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		x = sc.nextInt();
		return x;
	}

	public static int digitCounter(int x) {
		int result = 0;
		while (x > 0) {
			x = x / 10;
			result++;
		}
		return result;
	}

	public static void comparisonOfNumbers(int x, int y) {
		if (x > y) {
			System.out.print("the first number contains more digits");
		} else if (y > x) {
			System.out.print("the second number contains more digits");
		} else {
			System.out.print("equal number of digits");
		}
	}
}
