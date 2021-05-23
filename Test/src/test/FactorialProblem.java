package test;

public class FactorialProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int mul = 1;
		
		
		for(int i = n;i>0;i--)
		{
			mul = mul*i;
		}
		
		System.out.println(mul);
		
	}

}
