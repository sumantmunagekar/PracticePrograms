package test;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fibonacci series:

		int a = 0, b = 1, sum = 0;

		int[] x = new int[5];

		for (int i = 0; i < x.length; i++) {
			sum = a + b;
			a = b;
			b = sum;

			x[i] = sum;
		}

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
		System.out.println();

	}

}
