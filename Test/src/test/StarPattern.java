package test;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<4;i++)
		{
			for(int j=4-i; j>0;j--)
			{
				System.out.print("\t");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*\t"+"\t");
				
			}
			
			System.out.println();
		}

	}

}
