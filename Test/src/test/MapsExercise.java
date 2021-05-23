package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "sumant");
		map.put(2, "Riya");
		map.put(3, "Sujata");
		map.put(4, "Shantanu");
		
		//1st way to retrieve values
		/*for(int i = 1; i<=map.size();i++)
		{
			System.out.println(map.get(i));
		}*/
		
		System.out.println(map.get(2));
		
		Set s = map.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
