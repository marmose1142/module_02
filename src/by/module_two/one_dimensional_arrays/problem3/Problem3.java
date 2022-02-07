package by.module_two.one_dimensional_arrays.problem3;

import java.util.Scanner;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных
*и нулевых элементов.*/

public class Problem3 {

	public static void main(String[] args) {
		int r[];
		int n;
		int firstR;
		int minus = 0;
		int plus = 0;
		int zero = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n");
		n = sc.nextInt();
		System.out.println("Please, insert value of the first element of the array");
		firstR = sc.nextInt();

		r = new int[n];

		for (int i = 0; i < n; i++) {
			r[i] = firstR;
			firstR++;
		}

		for (int i = 0; i < r.length; i++) {
			if (r[i] < 0) {
				minus = minus + 1;
			}
			if (r[i] == 0) {
				zero = zero + 1;
			}
			if (r[i] > 0) {
				plus = plus + 1;
			}
		}
		System.out.println("in the array " + minus + " minus elements " + plus + " plus elements " + "and " + zero
				+ " zero elements ");

	}

}
