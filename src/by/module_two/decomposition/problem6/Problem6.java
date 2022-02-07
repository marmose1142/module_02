package by.module_two.decomposition.problem6;

import java.util.Scanner;

//Написать метод(методы) проверяющий,являются ли данные три числа взаимно простыми.

public class Problem6 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		num1 = enterFromConsole("Please,insert the value of the first number");
		num2 = enterFromConsole("Please,insert the value of the second number");
		num3 = enterFromConsole("Please,insert the value of the third number");

		int nod = NOD(num1, num2);
		int nod2 = NOD(nod, num3);

		if (nod2 == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

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

	public static int NOD(int x1, int x2) {
		if (x2 == 0) {
			return x1;
		} else if (x1 == 0) {
			return x2;
		} else {
			return NOD(x2, x1 % x2);
		}
	}

}
