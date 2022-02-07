package by.module_two.multidimensional_arrays.problem11;

import java.util.Random;

/*Матрицу 10х20 заполнить случайными числами от 0 до 15.Вывести на экран саму матрицу и номера строк,
* в которых число 5 встречается 3 и более раз.*/

public class Problem11 {

	public static void main(String[] args) {
		int ar[][] = new int[10][20];
		int five;
		boolean x = false;

		Random rndm = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rndm.nextInt(15);
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < ar.length; i++) {
			five = 0;
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == 5) {
					five = five + 1;
				}
			}
			if (five >= 3) {
				System.out.println("string - " + i);
				x = true;
			}
		}
		if (x == false) {
			System.out.println("no string");
		}

	}

}
