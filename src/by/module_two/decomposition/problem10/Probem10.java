package by.module_two.decomposition.problem10;

import java.util.Scanner;

/*Дано натурально число N.Написать метод(методы) для формирования массива,элементами которого являются
 *цифры числа N.*/

public class Probem10 {

	public static void main(String[] args) {
		int n;
		int x;
		n = enterFromConsole("Please, insert value n");
		x = arrayLength(n);
		arrayN(x, n);
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

	@SuppressWarnings("unused")
	public static int arrayLength(int n) {
		int count = 0;
		int temp;
		while (n > 0) {
			temp = n % 10;
			n = n / 10;
			count++;
		}
		return count;
	}

	public static void arrayN(int x, int n) {
		int[] arN = new int[x];
		for (int i = x; i > 0; i--) {
			arN[i - 1] = n % 10;
			n = n / 10;
		}
		System.out.print("Array n  = ");
		for (int i = 0; i < arN.length; i++) {
			System.out.print(" " + arN[i]);
		}
	}

}
