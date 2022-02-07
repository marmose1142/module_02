package by.module_two.multidimensional_arrays.problem10;

//Найти положительные элементы главной диагонали матрицы.

public class Problem10 {

	public static void main(String[] args) {
		int ar[][] = new int[][] { { 1, 2, 3, 4 }, { 5, -6, 7, 8 }, { 6, 5, 0, 3 }, { 0, 0, 0, 8 } };

		for (int i = 0; i < ar.length; i++) {
			if (ar[i][i] > 0) {
				System.out.print(ar[i][i] + " ");
			}
		}

	}

}
