package by.module_two.decomposition.problem13;

import java.util.Scanner;

/*Два простых числа называются "близнецами", если они отличаются друг от друга на 2(например, 41 и 43).Найти и напечатать
 * все пары "близнецов" из отрезка[n,2n], где n--заданное натуральное число больше 2. Для решения задачи использовать
 * декомпозицию. */

public class Problem13 {

	public static void main(String[] args) {
		int n;
		n = enterFromConsole("Please, insert value n(n > 2)");
		twinNumbers(n);
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

	public static void twinNumbers(int x) {
		int y = x * 2;
		int x2 = x + 2;
		while (x < y) {
			System.out.println(x + " & " + x2);
			x2++;
			x++;
		}

	}

}
