package ifarray;

public class If2 {

	public static void main(String[] args) {
		int i = 1, j = 1, k = 1, x;

		

		System.out.println("a) x = " + (x = (j >= 6 && k > 1) ? j++ : k + 1));

		System.out.println("b) x = " + (x = (5 > 1 || k >= 1) ? j + 3 : k + 1));

		System.out.println("c) x = " + (x = (j >= 1 && i <= 1) ? 10 : 20));

		System.out.println("d) x = " + (x = (i + j > 2 || k < 1) ? 2 : 4));

		System.out.println("e) x = " + (x = (3 / 2 > i) ? j + 5 : k));

		System.out.println("f) x = " + (x = (3 % 2 > i) ? j++ : ++k));

		System.out.println("g) x = " + (x = (i + 10 <= j + 10 || k == 0) ? -1 : -2));

		System.out.println("h) x = " + (x = (i == 0 || j == 1 || k == 2) ? 0 : 5));

		System.out.println("i) x = " + (x = (i == 0 || j == 1 && k == 2) ? 0 : 5));

		System.out.println("j) x = " + (x = (i != 0 || 5 == 1 && k == 2) ? 0 : 5));
	}

}
