package by.module_two.multidimensional_arrays.problem14;

import java.util.Scanner;

/*Сформировать случайную матрицу m x n, состоящая из нулей и единиц, причем в каждом столбце число
*единиц равно номеру столбца.*/

public class Problem14 {

	public static void main(String[] args) {
		int m[][];
		int x;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x(5 - 15)");
		x = sc.nextInt();
		System.out.println("Please, insert value n(5 - 15)");
		n = sc.nextInt();

		m = new int[x][n];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j > i) {
					m[i][j] = 1;
				} else {
					m[i][j] = 0;
				}
				System.out.print(m[i][j]);
			}
			System.out.println();
		}

	}

}
