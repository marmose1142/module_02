package by.module_two.multidimensional_arrays.problem15;

import java.util.Random;

//Найти наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Problem15 {

	public static void main(String[] args) {
		int ar[][] = new int[7][7];
		int max = 0;

		Random rndm = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rndm.nextInt(10);
				System.out.print(ar[i][j] + " ");
				if (ar[i][j] > max) {
					max = ar[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("maximum number = " + max);

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] % 2 != 0) {
					ar[i][j] = max;
				}
				System.out.print(ar[i][j] + " ");

			}
			System.out.println();
		}

	}

}
