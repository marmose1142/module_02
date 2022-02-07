package by.module_two.decomposition.problem15;

import java.util.Scanner;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность,
 * (например 1234,5789).Для решения использовать декомпозицию.
 */

public class Problem15 {

	public static void main(String[] args) {
		int n = enterFromConsole("Please, insert value n");
		int firstNumber = searchFirstNumber(n);
		int lastNumber = searchLastNumber(firstNumber, n);
		ascendingNumbers(firstNumber, lastNumber, n);
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

	public static int searchFirstNumber(int x) {
		boolean b = true;
		int result = 1;
		int num;
		int count = 0;
		while (b == true) {
			result++;
			count = 0;
			num = result;
			while (num > 0) {
				num = num / 10;
				count++;
			}
			if (count == x) {
				b = false;
			}
		}
		return result;
	}

	public static int searchLastNumber(int firstNumber, int x) {
		int result = firstNumber;
		x = x + 1;
		boolean b = true;
		int num;
		int count = 0;
		while (b == true) {
			result++;
			count = 0;
			num = result;
			while (num > 0) {
				num = num / 10;
				count++;
			}
			if (count == x) {
				b = false;
			}
		}
		return result - 1;
	}

	public static void ascendingNumbers(int x, int y, int n) {
		int result = 0;
		int number = 0;
		int supportNum = 0;
		int divisor = x;
		int j = 0;
		int count = 0;
		for (int i = x; i < y; i++) {
			j = i;
			result = i;
			supportNum = j / x;
			divisor = x;
			count = 0;
			while (j > 0) {
				number = j / divisor;
				j = j % divisor;
				divisor = divisor / 10;
				if (number == supportNum) {
					supportNum++;
					count++;
				}
				if (count == n) {
					System.out.println(result);
				}
			}

		}

	}

}
