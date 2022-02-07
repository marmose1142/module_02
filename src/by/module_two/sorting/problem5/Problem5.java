package by.module_two.sorting.problem5;

/*Сортировка вставками.Дана последовательность чисел а1,а2,...аn.Требуется поставить числа в порядке возрастания.
 * Примечание:Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции. */

public class Problem5 {

	public static void main(String[] args) {

		int[] ar = { 9, 7, 5, 4, 2, 6, 7, 8, 2, 1, 0, 7 };

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}

		binarySearch(ar);

		System.out.println();

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
	}

	public static int[] binarySearch(int[] array) {

		for (int key = 0; key < array.length; key++) {

			int value = array[key];
			int i = key - 1;

			for (; i >= 0; i--) {

				if (value < array[i]) {
					array[i + 1] = array[i];
				} else {
					break;
				}
			}

			array[i + 1] = value;
		}

		return array;
	}

}
