package by.module_two.decomposition.problem8;

import java.util.Scanner;

/*Задан массив D.Определить следующие суммы:D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6].
 * Пояснение:Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * с номерами от k до m. */

public class Problem8 {

	public static void main(String[] args) {
		int[] d = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int k = enterFromConsole("Please, insert value k(0-14)");
		int m = enterFromConsole("Please, insert value m(2-16)");
		int sum = sumElements(d, k, m);
		System.out.println("sum = " + sum);

	}

	public static int enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		return sc.nextInt();
	}

	public static int sumElements(int[] x, int k, int m) {
		int result = 0;

		for (int i = k; i <= m; i++) {
			result = result + x[i];
		}
		return result;

	}

}
