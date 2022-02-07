package by.module_two.multidimensional_arrays.problem8;

import java.util.Scanner;

/*В числовой матрице поменять столбцами два любых столбца, т.е. все элементы одного столбца поставить на
 * соответствующую им позицию другого столбца, а его элементы переместить в первый столбец. Номера столбцов
 * вводить пользователем с клавиатуры.*/

public class Problem8 {

	public static void main(String[] args) {
		int ar[][] = new int[][] { { 1, 2, 3, 4, 5 }, { 1, 2, 5, 6, 7 }, { 6, 7, 8, 9, 0 }, { 9, 8, 7, 6, 5 } };
		int firstColumn;
		int secondColumn;
		int supportVar;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert number of the first column(0-4)");
		firstColumn = sc.nextInt();
		System.out.println("Please, insert number of the second column(0-4)");
		secondColumn = sc.nextInt();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < ar.length; i++) {
			supportVar = ar[i][secondColumn];
			ar[i][secondColumn] = ar[i][firstColumn];
			ar[i][firstColumn] = supportVar;
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}

	}

}
