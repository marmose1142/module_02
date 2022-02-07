package by.module_two.sorting.problem8;

/*Даны дроби: p1/q1;p2/q2..pn/qn(pn,qn-натуральные).Составить программу, которая приводит эти дроби к общему знаменателю и
 * упорядочивает их в порядке возрастания.
 */

public class Problem8 {

	public static void main(String[] args) {
		Fraction[] ar = new Fraction[4];

		ar[0] = new Fraction();
		ar[1] = new Fraction();
		ar[2] = new Fraction();
		ar[3] = new Fraction();

		ar[0].numerator = 1;
		ar[0].denumerator = 2;
		ar[1].numerator = 1;
		ar[1].denumerator = 6;
		ar[2].numerator = 2;
		ar[2].denumerator = 4;
		ar[3].numerator = 1;
		ar[3].denumerator = 8;

		int lcm = leastCommonMultiple(ar[0].denumerator, ar[1].denumerator);
		lcm = leastCommonMultiple(lcm, ar[2].denumerator);
		lcm = leastCommonMultiple(lcm, ar[3].denumerator);

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i].numerator + "/" + ar[i].denumerator + " ; ");
		}

		System.out.println();

		for (int i = 0; i < ar.length; i++) {
			ar[i].numerator = lcm / ar[i].denumerator * ar[i].numerator;
			ar[i].denumerator = lcm;
			System.out.print(ar[i].numerator + "/" + ar[i].denumerator + " ; ");
		}

		System.out.println();

		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = ar.length - 1; j > 0; j--) {
				if (ar[j - 1].numerator > ar[j].numerator) {
					int pocket = ar[j - 1].numerator;
					ar[j - 1].numerator = ar[j].numerator;
					ar[j].numerator = pocket;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i].numerator + "/" + ar[i].denumerator + "; ");
		}
	}

	public static int leastCommonMultiple(int x1, int x2) {
		int result = 0;
		int i = 1;
		boolean bln = true;
		while (bln) {
			if (i % x1 == 0 & i % x2 == 0) {
				result = i;
				bln = false;
			}
			i++;
		}
		return result;
	}

}
