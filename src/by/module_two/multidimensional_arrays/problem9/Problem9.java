package by.module_two.multidimensional_arrays.problem9;

import java.util.Random;

/*Задана матрица неотрицательных чисел.Посчитать сумму элементов в каждом столбце. Определить, 
 * какой столбец содержит максимальную сумму. */

public class Problem9 {

	public static void main(String[] args) {
		int ar[][] = new int[4][4];
		int sum;
		int maxSum = 0;
		int maxColumn = 0;

		Random rndm = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rndm.nextInt(10);
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}

		for (int j = 0; j < ar[0].length; j++) {
			sum = 0;
			for (int i = 0; i < ar.length; i++) {
				sum = ar[i][j] + sum;
			}

			if (sum > maxSum) {
				maxSum = sum;
				maxColumn = j;
			}
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i][maxColumn]);
		}

	}
}
