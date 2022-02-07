package by.module_two.sorting.problem3;

/*Сортировка выбором.Дана последовательность чисел а1<=a2<=...<=an.Требуется переставить числа так, 
 * чтобы они были расположены по убыванию.*/

public class Problem3 {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 7, 7, 8, 9, 9 };
		int supportAr;
		int j = ar.length - 1;

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}

		System.out.println();

		for (int i = 0; i < ar.length; i++) {

			if (i == ar.length / 2) {
				break;
			}

			supportAr = ar[i];
			ar[i] = ar[j];
			ar[j] = supportAr;
			j--;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}

	}

}
