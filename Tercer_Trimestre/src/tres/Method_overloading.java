package tres;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class Method_overloading {
	public static void main(String args[]) {
		Adder ad = new Adder();
		ad.add(3, 4,5);
	}
}