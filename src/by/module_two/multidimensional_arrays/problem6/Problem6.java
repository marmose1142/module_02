package by.module_two.multidimensional_arrays.problem6;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданнаму образцу(n-четное):
*{1  1  1..  1  1  1
* 0  1  1..  1  1  0
* 0  0  1..  1  0  0
* .  .  ..   .  .  .
* .  .  ..   .  .  .
* .  .  ..   .  .  .
* 0  1  1    1  1  0
* 1  1  1    1  1  1 }
*/

public class Problem6 {

	public static void main(String[] args) {
		int n;
		int ar[][];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n(even integer)");
		n = sc.nextInt();

		ar = new int[n][n];

		for (int i = 0; i < ar.length / 2; i++) {
			for (int j = i; j < ar[i].length / 2; j++) {
				ar[i][j] = 1;
			}
		}

		for (int i = 0; i < ar.length / 2; i++) {
			for (int j = (n - 1) - i; j >= ar[i].length / 2; j--) {
				ar[i][j] = 1;
			}
		}

		int supportJ = 0;
		for (int i = n - 1; i >= ar.length / 2; i--) {
			for (int j = supportJ; j < ar[i].length / 2; j++) {
				ar[i][j] = 1;
			}
			supportJ++;
		}

		int supportJtwo = 1;
		for (int i = n - 1; i >= ar.length / 2; i--) {
			for (int j = n - supportJtwo; j >= ar[i].length / 2; j--) {
				ar[i][j] = 1;
			}
			supportJtwo++;
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}

	}

}
