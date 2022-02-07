package by.module_two.one_dimensional_arrays.problem8;

import java.util.Random;
import java.util.Scanner;

/*Дана последовательность целых чисел а1,а2,...аn. Образовать новую последовательность, выбросив из исходной те члены
 * которые равны min(а1,а2,...аn). */

public class Problem8 {

	public static void main(String[] args) {
		int n;
		int a[];
		int min;
		int quantityMin = 0;
		int aNew[];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n(array length)");
		n = sc.nextInt();

		a = new int[n];
		Random rnd = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(50);
		}

		System.out.print("first array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "; ");
		}

		min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] <= min) {
				min = a[i];
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				quantityMin = quantityMin + 1;
			}
		}

		aNew = new int[n - quantityMin];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != min) {
				aNew[j] = a[i];
				j++;
			}
		}

		System.out.println(" ");
		System.out.print("final array: ");
		for (j = 0; j < aNew.length; j++) {
			System.out.print(aNew[j] + "; ");
		}

	}

}
