package by.module_two.one_dimensional_arrays.problem9;

import java.util.Random;
import java.util.Scanner;

/*В массиве целых чисел с количеством элементов n найти наиболее частовстречающееся число. Если таких чисел несколько, 
 * то определить наименьшее из них. */

public class Problem9 {

	public static void main(String[] args) {
		int n;
		int num[];
		int supportNum = 0;
		int supportNum2 = 0;
		int mostCommon = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n(array length)");
		n = sc.nextInt();

		num = new int[n];
		Random rnd = new Random();

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(10);
		}

		System.out.print("array: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "; ");
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] == num[j]) {
					supportNum = supportNum + 1;
				}
			}

			if (supportNum > supportNum2) {
				supportNum2 = supportNum;
				supportNum = 0;
				mostCommon = num[i];
			}

			else if (supportNum == supportNum2) {
				supportNum2 = supportNum;
				supportNum = 0;
				if (mostCommon > num[i]) {
					mostCommon = num[i];
				}

			} else {
				supportNum = 0;
			}

		}

		System.out.println();
		System.out.print("result = " + mostCommon);

	}

}
