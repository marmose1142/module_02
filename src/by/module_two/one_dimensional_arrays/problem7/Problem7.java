package by.module_two.one_dimensional_arrays.problem7;

import java.util.Random;
import java.util.Scanner;

//Даны действительные числа а1, а2,...аn. Найти max(a1+a2n,a2+a2n-1,...,an+an+1)).

public class Problem7 {

	public static void main(String[] args) {
		int n;
		int a[];
		int max;
		int supportMax;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert even value n(array length)");
		n = sc.nextInt();

		a = new int[n];

		Random rnd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(50);
		}

		System.out.print("array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ; ");
		}

		int i = 1;
		int j = n - 2;
		max = a[0] + a[n - 1];
		while (i != n / 2) {
			supportMax = a[i] + a[j];
			if (supportMax > max) {
				max = supportMax;
			}
			i++;
			j--;
		}
		System.out.println("max = " + max);
	}

}
