package by.module_two.sorting.problem1;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объеденить их в один массив,
 * включив второй массив между к-м и (к+1)-м элементами первого, при этом не используя дополнительный массив.
 */

public class Problem1 {

	public static void main(String[] args) {
		int[] ar1;
		int[] ar2;
		int[] resultAr;
		int k;

		ar1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ar2 = new int[] { 0, 0, 0, 0, 0 };
		k = 5;

		resultAr = new int[ar1.length + ar2.length];

		for (int i = 0; i < resultAr.length; i++) {
			if (i < k + 1) {
				resultAr[i] = ar1[i];
			} else if (i > k + ar2.length) {
				int supportI = ar2.length;
				resultAr[i] = ar1[i - supportI];
				supportI++;
			} else {
				resultAr[i] = ar2[i - (k + 1)];
			}

		}
		for (int j = 0; j < resultAr.length; j++) {
			System.out.print(resultAr[j]);
		}

	}

}
