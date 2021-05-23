package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls = new ArrayList<String>();

		ls.add("Sumant");
		ls.add("Riya");
		ls.add("Sujata");
		ls.add("Shantanu");
		ls.add("Sumant");

		/*
		 * for(int i=0; i<ls.size();i++) { System.out.println(ls.get(i)); }
		 */

		Iterator it = ls.iterator();
		String s = "";
		while (it.hasNext()) {
			// System.out.println(it.next());
			s = (String)it.next();
			if (s.equals("Riya")) {
				it.remove();
				break;
			}

		}

		
		for (String a: ls) {
	         System.out.println(a);
	      }

	}

}
