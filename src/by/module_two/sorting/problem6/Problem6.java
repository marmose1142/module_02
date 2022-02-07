package by.module_two.sorting.problem6;

//Сортировка Шелла.Дан массив n действительных чисел.Требуется упорядочить его по возрастанию.

public class Problem6 {

	public static void main(String[] args) {
		int[] arN;
		arN = new int[] { 2, 1, 4, 3, 6, 5, 3, 9, 6, 7, 8, 4, 0 };

		for (int i = 0; i < arN.length; i++) {
			System.out.print(arN[i]);
		}

		for (int step = arN.length / 2; step > 0; step /= 2) {
			for (int i = step; i < arN.length; i++) {
				for (int j = i - step; j >= 0 && arN[j] > arN[j + step]; j -= step) {
					int tmp = arN[j];
					arN[j] = arN[j + step];
					arN[j + step] = tmp;
				}
			}
		}

		System.out.println();

		for (int i = 0; i < arN.length; i++) {
			System.out.print(arN[i]);
		}
	}

}
