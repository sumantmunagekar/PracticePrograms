package test;

public class IntegerPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12345, b=a;
		int rev = 0;
		
		while(a!=0)
		{
			rev = rev*10 + a%10;
			a=a/10;
			
		}

		System.out.println(rev);
		
		if(rev==b)
		{
			System.out.println("it is a pallindrome");
		}
		else
			System.out.println("It is not a pallindrome");
		
	}

}
