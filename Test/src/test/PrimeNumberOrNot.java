package test;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//checking if a number is a prime no or not
		
				int m=0, flag = 0;
				int n=24;
				
				
				if(n==0 || n==1)
				{
					System.out.println("No is not a prime no");
				}
				else
				{
					for(int i=2; i<n;i++)
					{
						if(n%i==0)
						{
							flag = 1;
							System.out.println("No is not a prime no");
							break;
						}
						
					}
					if(flag==0)
					{
						System.out.println("No is a prime no");
					}
					
				}
				

	}

}
