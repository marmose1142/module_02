package by.module_two.decomposition.problem14;

import java.util.Scanner;

/*Натурально число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в 
 * степень n, равна самому числу.Найти все числа от 1 до k.Для решения задачи использовать декомпозицию.
 */

public class Problem14 {

	public static void main(String[] args) {
		int k = enterFromConsole("Please, insert value k");
		searchNumbers(k);
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

	public static int searchN(int x) {
		int result = 0;
		while (x > 0) {
			x = x / 10;
			result++;
		}
		return result;
	}

	public static int sumNumbers(int x, int n) {
		int result = 0;
		int digit = 0;
		while (x > 0) {
			digit = x % 10;
			x = x / 10;
			result = result + (int) Math.pow(digit, n);
		}
		return result;
	}

	public static void searchNumbers(int x) {
		int nPow = 0;
		int sumPow = 0;
		for (int i = 1; i < x; i++) {
			nPow = searchN(i);
			sumPow = sumNumbers(i, nPow);

			if (sumPow == i) {
				System.out.println(i);
			}

		}

	}

}
