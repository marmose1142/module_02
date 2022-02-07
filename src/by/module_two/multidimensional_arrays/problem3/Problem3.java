package by.module_two.multidimensional_arrays.problem3;

import java.util.Scanner;

//Дана матрица.Вывести к-ю строку и р-й столбец матрицы.

public class Problem3 {

	public static void main(String[] args) {
		int k;
		int p;
		int ar[][] = new int[][] { { 1, 2, 3, 4, 5 }, { 3, 4, 5, 6, 7 }, { 9, 8, 7, 3, 6 }, { 7, 9, 0, 0, 0 },
				{ 7, 8, 9, 0, 4 } };

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value k(0-4)");
		k = sc.nextInt();
		System.out.println("Please, insert value p(0-4)");
		p = sc.nextInt();

		for (int i = 0; i < ar[k].length; i++) {
			System.out.print(ar[k][i]);
		}

		System.out.println();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (j == p) {
					System.out.println(ar[i][j]);
				}

			}
		}

	}

}
