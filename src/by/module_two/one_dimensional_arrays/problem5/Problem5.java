package by.module_two.one_dimensional_arrays.problem5;

import java.util.Random;
import java.util.Scanner;

//Даны целые числа а1,а2,...аn. Вывести на экран только те числа, для которых а[i]>i.

public class Problem5 {

	public static void main(String[] args) {
		int a[];
		int n;

		Random rnd = new Random();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n (10-50)");
		n = sc.nextInt();

		a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(50);
		}

		System.out.print("we have an array: ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}

		System.out.println();
		System.out.print("numbers that match the condition: ");

		for (int i = 0; i < a.length; i++) {
			if (a[i] > i) {
				System.out.print(" " + a[i] + " ");
			}
		}
	}

}
