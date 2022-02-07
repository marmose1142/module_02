package by.module_two.multidimensional_arrays.problem13;

import java.util.Random;

//Отсортировать строки матрицы по возростанию и убыванию значений элементов.

public class Problem13 {

	public static void main(String[] args) {
		int ar[][] = new int[6][6];
		int supportVar;

		Random rndm = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rndm.nextInt(9);
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-------------");

		for (int c = ar.length - 1; c >= 1; c--) {
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < ar.length; j++) {
					if (ar[i][j] > ar[i + 1][j]) {
						supportVar = ar[i][j];
						ar[i][j] = ar[i + 1][j];
						ar[i + 1][j] = supportVar;
					}
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("------------");

		for (int c = ar.length - 1; c >= 1; c--) {
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < ar.length; j++) {
					if (ar[i + 1][j] > ar[i][j]) {
						supportVar = ar[i + 1][j];
						ar[i + 1][j] = ar[i][j];
						ar[i][j] = supportVar;
					}
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
