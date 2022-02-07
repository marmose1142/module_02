package by.module_two.sorting.problem4;

/*Сортировка обменами.Дан массив чисел.Требуется переставить числа в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количество перестановок. */

public class Problem4 {

	public static void main(String[] args) {

		int[] ar = { 0, 0, 3, 6, 1, 4, 89, 23, 4, 6, 1, 0, 123, 8 };
		int numberPermutations = 0;

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();

		int numberIterations;
		numberIterations = ar.length;
		int j = 0;
		int minNumber = ar[0];
		int indexMinNumber = 0;
		int auxiliaryStorageNumber;
		boolean supportNumberPermutations;

		while (numberIterations > 0) {

			supportNumberPermutations = false;
			minNumber = ar[j];
			indexMinNumber = j;

			for (int i = j; i < ar.length; i++) {

				if (j > 0) {
					if (ar[j] != ar[j - 1]) {
						supportNumberPermutations = true;
					}
				}

				if (ar[i] <= minNumber) {
					minNumber = ar[i];
					indexMinNumber = i;
				}

			}

			if (supportNumberPermutations == true) {
				numberPermutations++;
			}

			auxiliaryStorageNumber = ar[j];
			ar[j] = minNumber;
			ar[indexMinNumber] = auxiliaryStorageNumber;
			j++;
			numberIterations--;

		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println("Number permutations = " + numberPermutations);

	}

}
