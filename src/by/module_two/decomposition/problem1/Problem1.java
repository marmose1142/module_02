package by.module_two.decomposition.problem1;

import java.util.Scanner;

/*Написать метод(методы)для нахождения  наибольшего общего делителя и наименьшего общего кратного
 * двух натуральных чисел: {НОК(А,В)=А*В/НОД(А,В)}
 */

public class Problem1 {

	public static void main(String[] args) {
		int a;
		int b;
		int greatestDivisor;
		int lowestMultiple;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a(a > 0)");
		a = sc.nextInt();
		System.out.println("Please, insert value b(b > 0)");
		b = sc.nextInt();

		greatestDivisor = greatestCommonDivisor(a, b);
		System.out.println("greatest common divisor = " + greatestDivisor);
		lowestMultiple = lowestCommonMultiple(a, b);
		System.out.println("lowest common multiple = " + lowestMultiple);
	}

	public static int greatestCommonDivisor(int x1, int x2) {
		if (x2 == 0) {
			return x1;
		} else {
			return greatestCommonDivisor(x2, x1 % x2);
		}
	}

	public static int lowestCommonMultiple(int x1, int x2) {
		int d = greatestCommonDivisor(x1, x2);
		return (x1 * x2) / d;
	}
}
