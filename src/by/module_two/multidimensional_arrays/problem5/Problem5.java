package by.module_two.multidimensional_arrays.problem5;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданнаму образцу(n-четное):
*{1  1  1..  1  1
* 2  2  2..  2  0
* 3  3  3..  0  0
* .  .  ..   .  .
* .  .  ..   .  .
* .  .  ..   .  .
*n-1 n-1 0   0  0
* n  0   0   0  0 }
*/

public class Problem5 {

	public static void main(String[] args) {
		int n;
		int ar[][];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n(even integer)");
		n = sc.nextInt();

		ar = new int[n][n];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length - i; j++) {
				ar[i][j] = i + 1;
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
