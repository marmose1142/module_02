package by.module_two.decomposition.problem12;

import java.util.Scanner;

/*Даны натуральные числа K и N. Написать метод(методы) формирования массива A,элементами которого являются числа,
 * сумма цифр которых является K и которые не больше N.
 */

public class Problem12 {

	public static void main(String[] args) {
		int k;
		int n;
		int An;

		k = enterFromConsole("Please, insert value k");
		n = enterFromConsole("Please, insert value n");
		An = searchArrayLength(k, n);
		formationArrayA(k, n, An);

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

	public static int searchArrayLength(int x, int y) {
		int sum = 0;
		int a;
		int m;
		int result = 0;

		for (int i = 1; i < y; i++) {
			a = i;
			while (a > 0) { // ����� ����� �� �����
				m = a % 10;
				a = a / 10;
				sum = sum + m;

			}
			// ����� ����
			if (sum == x) {
				// ������� �����
				result++;
			}

			sum = 0;
		}

		return result;
	}

	public static void formationArrayA(int x, int y, int An) {
		int sum;
		int b;
		int m;
		int[] a;

		a = new int[An];
		sum = 0;

		for (int i = 1; i < y; i++) {
			b = i;
			while (b > 0) { // ����� ����� �� �����
				m = b % 10;
				b = b / 10;
				sum = sum + m;
			}
			// ����� ����
			if (sum == x) {
				for (int j = a.length - (a.length - 1); j > 0; j--) {
					a[j] = i;
					System.out.print(a[j] + "; ");
				}
			}
			sum = 0;
		}
	}
}
