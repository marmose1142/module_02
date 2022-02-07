package by.module_two.multidimensional_arrays.problem4;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданнаму образцу(n-четное):
*{1  2   3.. n
* n n-1 n-2..1
* 1  2   3.. n
* n n-1 n-2..1
* ...........
* n n-1 n-2..1}
*/

public class Problem4 {

	public static void main(String[] args) {
		int n;
		int ar[][];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n(even integer)");
		n = sc.nextInt();

		ar = new int[6][n];
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				System.out.println();
				for (int j = 0; j < ar[i].length; j++) {
					ar[i][j] = j + 1;
					System.out.print(ar[i][j] + " ");
				}
			} else {
				System.out.println();
				for (int j = 0; j < ar[i].length; j++) {
					ar[i][j] = n - j;
					System.out.print(ar[i][j] + " ");
				}
			}

		}
	}

}
