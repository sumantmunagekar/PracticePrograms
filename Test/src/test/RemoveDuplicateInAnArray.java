package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"a","b","c","d","a","e","c","f","i"};
		List<String> b = new ArrayList<String>(Arrays.asList(a));
		
		//b = Arrays.asList(a);
		String c = "";
		int count=0;
		int size = b.size();
		
		
		for(int i=0; i<size;i++)
		{
			c = b.get(i);
			for(int j=0; j<b.size();j++)
			{
				
				if(c.equalsIgnoreCase(b.get(j)))
				{
					
					size = b.size();
					count++;
				}
				if(count>1)
				{
					b.remove(i);
				}
				
			}
			count=0;
			
		}
		
		System.out.println("final String: "+b);

	}

}
