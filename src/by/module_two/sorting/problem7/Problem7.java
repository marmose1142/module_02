package by.module_two.sorting.problem7;

/*Пусть даны две неубывающие последовательности действительных чисел а1<=a2<=...<=an, b1<=b2<=...<=bm. Требуется указать те места,
 * на которые нужно вставлять элементы последовательности b1<=b2<=..<=bm в первую послеовательность так, чтобы новая 
 * последовательность оставалась возрастающей. */

public class Problem7 {

	public static void main(String[] args) {
		int[] arOne = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arTwo = { 2, 3, 5, 7, 45, 67, 100, 102, 105 };
		int[] arResult = new int[arOne.length + arTwo.length];

		int iOne = 0;
		int iTwo = 0;
		int iResult = 0;
		int counter = arResult.length;

		while (counter > 0) {

			if (arOne[iOne] <= arTwo[iTwo]) {
				arResult[iResult] = arOne[iOne];
				iResult++;
				iOne++;
				if (iOne == arOne.length) {
					for (int i = iResult; i < arResult.length; i++) {
						arResult[i] = arTwo[iTwo];
						iTwo++;
						counter--;
					}
				}
			} else {
				arResult[iResult] = arTwo[iTwo];
				iResult++;
				iTwo++;
				if (iTwo == arTwo.length) {
					for (int i = iResult; i < arResult.length; i++) {
						arResult[i] = arOne[iOne];
						iOne++;
						counter--;
					}
				}
			}
			counter--;
		}

		for (int i = 0; i < arResult.length; i++) {
			System.out.print(arResult[i] + " ");
		}

	}

}
