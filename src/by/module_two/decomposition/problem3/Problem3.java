package by.module_two.decomposition.problem3;

import java.util.Scanner;

//Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади треугольника.

public class Problem3 {

	public static void main(String[] args) {
		double a;
		double s;

		a = enterFromConsole("Please, insert the value of side A");
		s = areaHexagon(a);

		System.out.println("the area of hexagon = " + s);
	}

	public static double enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		return sc.nextDouble();
	}

	public static double areaHexagon(double x) {
		double s;
		s = (Math.pow(x, 2) * Math.sqrt(3)) / 4;
		s = s * 6;
		return s;
	}

}
