package by.module_two.one_dimensional_arrays.problem6;

import java.util.Random;
import java.util.Scanner;

/*Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами. */

public class Problem6 {

	public static void main(String[] args) {
		int n;
		int realNumber[];
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Pease, insert value n(array length)");
		n = sc.nextInt();

		realNumber = new int[n];
		Random rnd = new Random();

		for (int i = 0; i < realNumber.length; i++) {
			realNumber[i] = rnd.nextInt(n);
		}

		if (realNumber.length >= 3) {
			sum = realNumber[2];

			for (int i = 3; i < realNumber.length; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					}
					if (j == i - 1) {
						sum = sum + realNumber[i];
					}
				}
			}
		} else {
			System.out.println("no numbers");
		}

		System.out.println(" sum = " + sum);

	}

}
