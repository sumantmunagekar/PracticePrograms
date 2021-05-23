package test;

public class StringPallindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String a = "bob";
	String b = "";
	
	for(int i=a.length()-1; i>=0;i--)
	{
		b = b + a.charAt(i);
	}
	
	System.out.println(b);
	
	if(b.equalsIgnoreCase(a))
	{
		System.out.println("It is a pallindrome");
	}
	else
		System.out.println("It is not a pallindrome");
		
	}

}
