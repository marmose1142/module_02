package by.module_two.decomposition.problem7;

//Написать метод(методы) для вычесления суммы факториалов всех нечетных чисел от 1 до 9.

public class Problem7 {

	public static void main(String[] args) {
		int sum;
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		sum = sumFactorials(ar);
		System.out.println("sum of factorials = " + sum);
	}

	public static int sumFactorials(int[] x) {
		int[] ar = new int[x.length];
		ar = x;
		int sum = 1;
		int supportSum = 1;
		int result = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 != 0) {
				while (supportSum <= ar[i]) {
					sum = supportSum * sum;
					supportSum++;
				}
				result = result + sum;
				sum = 1;
				supportSum = 1;
			}
		}

		return result;
	}

}
