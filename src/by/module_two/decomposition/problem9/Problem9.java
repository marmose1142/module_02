package by.module_two.decomposition.problem9;

import java.util.Scanner;

/*Даны числа X,Y,Z,T-длины сторон четырехугольника.Написать метод(методы) вычисления его площади,если
 * угол между сторонами X и Y-прямой.*/

public class Problem9 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int t;
		double s;

		x = enterFromConsole("Please, insert value x");
		y = enterFromConsole("Please, insert value y");
		z = enterFromConsole("Please, insert value z");
		t = enterFromConsole("Please, insert value t");
		s = x * y * 0.5;
		s = areaQuadrangle(x, y, z, t) + s;
		System.out.println("area = " + s);
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

	public static double areaQuadrangle(int x, int y, int z, int t) {
		double dd;
		double result;
		dd = Math.sqrt((x * x + y * y));
		result = 0.25 * Math.sqrt((dd + z + t) * (dd + z - t) * (dd + t - z) * (z + t - dd));
		return result;
	}

}
