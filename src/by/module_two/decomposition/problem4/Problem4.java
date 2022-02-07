package by.module_two.decomposition.problem4;

import java.util.Random;
import java.util.Scanner;

/*На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек
 * самое большое расстояние. Указание:Координаты точек занести в массив.*/

public class Problem4 {

	public static void main(String[] args) {
		int[][] ArXY;
		int n;
		int[][] maxDistance = new int[2][2];
		n = enterFromConsole("Please, insert value n(2-10)");
		ArXY = new int[n][2];
		ArXY = randomArXY(n, 2);
		maxDistance = maximalDistance(ArXY, n);
		System.out.println("maximum distance between points x " + maxDistance[0][0] + " y " + maxDistance[0][1]
				+ " and x " + maxDistance[1][0] + " y " + maxDistance[1][1]);

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

	public static int[][] randomArXY(int x, int y) {
		int point = 1;
		int[][] ArXY = new int[x][y];
		Random rndm = new Random();
		for (int i = 0; i < ArXY.length; i++) {
			for (int j = 0; j < ArXY[i].length; j++) {
				ArXY[i][j] = rndm.nextInt(9);
				if (j == 0) {
					System.out.print("point number " + point + ":" + " " + "x = " + ArXY[i][j] + " ");
					point++;
				} else {
					System.out.print("y = " + ArXY[i][j] + " ");
				}
			}
			System.out.println();
		}
		return ArXY;
	}

	public static int[][] maximalDistance(int[][] ArXY, int x) {
		int[][] maxDistance = new int[2][2];
		int[][] ArXYDuplicate = new int[x][2];
		double maxDist = 0;
		double supportMaxDist = 0;
		ArXYDuplicate = ArXY;

		int j = 0;
		int k = 1;
		for (int i = 0; i < ArXYDuplicate.length - 1; i++) {
			maxDist = Math.sqrt(Math.pow((ArXYDuplicate[i + 1][j] - ArXYDuplicate[i][j]), 2)
					+ Math.pow((ArXYDuplicate[i + 1][k] - ArXYDuplicate[i][k]), 2));
			if (maxDist > supportMaxDist) {
				supportMaxDist = maxDist;
				maxDist = 0;
				maxDistance[0][0] = ArXYDuplicate[i][j];
				maxDistance[0][1] = ArXYDuplicate[i][k];
				maxDistance[1][0] = ArXYDuplicate[i + 1][j];
				maxDistance[1][1] = ArXYDuplicate[i + 1][k];

			}
		}
		return maxDistance;
	}

}
