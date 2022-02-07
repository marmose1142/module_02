package by.module_two.decomposition.problem17;

import java.util.Scanner;

/*Из заданного числа вычли сумму его цифр.Из результата сново вычли сумму его цифр и тд.Сколько таких действий надо
 * произвести,чтобы получить нуль?Использ.декомпозицию.
 */

public class Problem17 {

	public static void main(String[] args) {
		int n;
		int quantityIterations = 0;

		n = enterFromConsole("Please, insert value n");

		while (n > 0) {
			n = subtractingAmount(n);
			quantityIterations++;
		}
		System.out.println(quantityIterations);
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

	public static int subtractingAmount(int number) {
		int result = 0;
		int figure;
		int supportNumber = number;

		while (supportNumber > 0) {
			figure = supportNumber % 10;
			supportNumber = supportNumber / 10;
			result = result + figure;
		}
		result = number - result;
		return result;
	}

}
