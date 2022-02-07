package by.module_two.one_dimensional_arrays.problem10;

import java.util.Scanner;

/*Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент(освободившиеся
 * элементы заполнить нулями).Дополнительный массив не использовать.*/

public class Problem10 {

	public static void main(String[] args) {
		int n;
		int ar[];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n(array length)");
		n = sc.nextInt();

		ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 10);
		}

		System.out.print("first array: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ; ");
		}

		int j = 2;
		if (n % 2 != 0) {
			for (int i = 1; i <= ar.length / 2; i++) {
				ar[i] = ar[j];
				j = j + 2;
			}

			for (int i = n - 1; i > ar.length / 2; i--) {
				ar[i] = 0;
			}
			
		} else if (n % 2 == 0) {
			for (int i = 1; i < ar.length / 2; i++) {
				ar[i] = ar[j];
				j = j + 2;
			}

			for (int i = n - 1; i >= ar.length / 2; i--) {
				ar[i] = 0;
			}

		}

		System.out.println();
		System.out.print("final array: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ; ");
		}

	}

}
