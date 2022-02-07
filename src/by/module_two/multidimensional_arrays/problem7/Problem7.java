package by.module_two.multidimensional_arrays.problem7;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка N по правилу:
* A[I,J] = sin{I² - J² / N}*/

public class Problem7 {

	public static void main(String[] args) {
		int n;
		double ar[][];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n");
		n = sc.nextInt();

		ar = new double[n][n];
        
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = Math.sin(Math.pow(i, 2) - Math.pow(j, 2) / n);
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ; ");
			}
			System.out.println();
		}

	}

}
