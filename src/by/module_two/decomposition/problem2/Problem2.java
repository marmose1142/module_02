package by.module_two.decomposition.problem2;

import java.util.Scanner;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Problem2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		int d2;
		int d3;
		int greatestDivisor;

		num1 = enterFromConsole("Please, insert even value of the first number");
		num2 = enterFromConsole("Please, insert even value of the second number");
		num3 = enterFromConsole("Please, insert even value of the third number");
		num4 = enterFromConsole("Please, insert even value of the fourth number");

		d2 = greatestCommonDivisor(num1, num2);
		d3 = greatestCommonDivisor(d2, num3);
		greatestDivisor = greatestCommonDivisor(d3, num4);

		System.out.println("greatest common divisor for four numbers = " + greatestDivisor);
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

	public static int greatestCommonDivisor(int x1, int x2) {
		if (x2 == 0) {
			return x1;
		} else {
			return greatestCommonDivisor(x2, x1 % x2);
		}
	}

}
