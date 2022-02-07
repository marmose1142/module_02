package by.module_two.one_dimensional_arrays.problem1;

import java.util.Scanner;

//В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Problem1 {

	public static void main(String[] args) {
		int[] a;
		int n;
		int k;
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n");
		n = sc.nextInt();
		System.out.println("Please, insert value k");
		k = sc.nextInt();

		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println("sum = " + sum);

	}

}
