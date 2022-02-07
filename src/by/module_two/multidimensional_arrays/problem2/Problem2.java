package by.module_two.multidimensional_arrays.problem2;

//Дана квадратная матрица. Вывести на экран элементы, стоящиe по диагонали.

public class Problem2 {

	public static void main(String[] args) {
		int[][] ar = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 2, 4, 3, 4 }, { 9, 8, 7, 6 } };

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (j == i) {
					System.out.print(ar[i][j] + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
