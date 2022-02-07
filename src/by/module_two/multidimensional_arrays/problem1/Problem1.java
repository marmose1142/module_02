package by.module_two.multidimensional_arrays.problem1;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Problem1 {
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 4, 5, 5 }, { 2, 3, 4, 5, 1, 1 }, { 9, 8, 7, 6, 5, 5 },
				{ 6, 7, 8, 9, 1, 1 }, { 5, 6, 7, 1, 2, 2 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if ((matrix[0][j] > matrix[4][j]) & (!(j % 2 == 0))) {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
