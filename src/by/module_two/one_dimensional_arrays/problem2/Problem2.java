package by.module_two.one_dimensional_arrays.problem2;

import java.util.Scanner;

/*Дана последовательность действительных чисел а1,а2,...аN.Заменить все ее члены,большие данного Z,этим числом, 
* подсчитать количество замен. */

public class Problem2 {

	public static void main(String[] args) {
		int[] a;
		int n;
		int z;
		int replacements = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n");
		n = sc.nextInt();
		System.out.println("Please, insert value z");
		z = sc.nextInt();

		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				replacements = replacements + 1;
			}
		}
		System.out.println("number of replacements = " + replacements);

	}

}
