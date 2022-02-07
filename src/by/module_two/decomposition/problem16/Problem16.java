package by.module_two.decomposition.problem16;

import java.util.Scanner;

/*Написать программу, определяющую сумму n-значных чисел,содержащих только нечетные цифры.
*Определить также,сколько четных цифр в найденной сумме.Использ.декомпозицию.*/

public class Problem16 {

	public static void main(String[] args) {
		int sumNnumber;
		int evenNumber;
		int n;

		n = enterFromConsole("Please, insert number n(1-5)");
		sumNnumber = findingSumNumbers(n);
		evenNumber = findingEvenNumber(sumNnumber);
		System.out.println(sumNnumber);
		System.out.println(evenNumber);
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

	public static int findingSumNumbers(int n) {
		int result = 0;
		int i = 1;
		int j = 0;

		while (n > 1) {
			i = i * 10;
			n--;
		}

		j = i * 10 - 1;

		for (int k = i; k <= j; k++) {
			int l = k;
			while (l > 0) {
				int m;
				m = l % 10;
				l = l / 10;
				if (m % 2 == 0) {
					break;
				}
				if (l == 0) {
					result = result + k;
				}
			}

		}
		return result;
	}

	public static int findingEvenNumber(int sumNnumber) {
		int result = 0;
		int supportResult = 0;
		while (sumNnumber > 0) {
			supportResult = sumNnumber % 10;
			sumNnumber = sumNnumber / 10;
			if (supportResult % 2 == 0) {
				result++;
			}
		}
		return result;
	}

}
