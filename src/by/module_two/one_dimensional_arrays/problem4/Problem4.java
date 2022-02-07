package by.module_two.one_dimensional_arrays.problem4;

//Даны действительные числа а1, а2,...аn.Поменять местами наибольший и наименьший элемент.

public class Problem4 {

	public static void main(String[] args) {
		int a[] = new int[] { 2, 3, 1, 4, 5, 9, 6, 7, 8 };
		int max = a[0];
		int min = a[0];
		int auxiliaryVariable;

		System.out.print("original array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[min]) {
				min = i;
			}
			if (a[i] > a[max]) {
				max = i;
			}
		}

		auxiliaryVariable = a[min];
		a[min] = a[max];
		a[max] = auxiliaryVariable;

		System.out.println();
		System.out.print("final array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

}
