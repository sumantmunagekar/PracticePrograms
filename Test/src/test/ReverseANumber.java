package test;

public class ReverseANumber {

	public int RevNum(int a) {
		int b = 0;

		while (a != 0) {
			b = b * 10 + a % 10;
			a = a / 10;
		}

		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseANumber rNum = new ReverseANumber();
		
		System.out.println(rNum.RevNum(123456789));

	}

}
