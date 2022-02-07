package by.module_two.decomposition.problem5;

import java.util.Random;
import java.util.Scanner;

/*Составить программу, которая в массиве A[N] находит второе по величине число(вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).*/

public class Problem5 {

	public static void main(String[] args) {
		int[] a;
		int n;
		int secondLargestNumber = 0;

		n = enterFromConsole("Please, insert value n(2 - 20)");
		a = new int[n];
		a = randomArray(n);
		secondLargestNumber = numberSearch(a);
		System.out.println("second largest number = " + secondLargestNumber);

	}

	public static int enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		return sc.nextInt();
	}

	public static int[] randomArray(int x) {
		int[] a = new int[x];
		Random rndm = new Random();
		System.out.print("array A = ");
		for (int i = 0; i < a.length; i++) {
			a[i] = rndm.nextInt(24);
			System.out.print(" " + a[i] + " ");
		}
		return a;
	}

	public static int numberSearch(int[] x) {
		int number = 0;
		int maxNumber;
		int[] duplicateA = x;
		maxNumber = duplicateA[0];
		for (int i = 1; i < duplicateA.length; i++) {
			if (duplicateA[i] > maxNumber) {
				number = maxNumber;
				maxNumber = duplicateA[i];
			}
			if (number < duplicateA[i] & duplicateA[i] < maxNumber) {
				number = duplicateA[i];
			}

		}
		return number;
	}

}
