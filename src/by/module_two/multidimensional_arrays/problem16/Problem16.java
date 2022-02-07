package by.module_two.multidimensional_arrays.problem16;

import java.util.Scanner;

/*Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел 1,2,3...n²
*так, что суммы по каждому столбцу,каждой строке и каждой из двух больших диагоналей равны между собой.
*Построить такой квадрат. Пример магического квадрата порядка 3:
*6 1 8
*7 5 3
*2 9 4*/

public class Problem16 {

	public static void main(String[] args) {
		int ar[][];
		int n;
		int num = 1;
		int nan;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n(matrix size)");
		n = sc.nextInt();
		ar = new int[n][n];
		nan = n * 3 / 2;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ar[(j - i + nan) % n][(i * 2 - j + n) % n] = num++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
