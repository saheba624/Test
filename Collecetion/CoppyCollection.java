package c1.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CoppyCollection {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		ArrayList a2=new ArrayList<>();
		a1.add("1");
		a1.add("2");
		a1.add("3");
		
	/*	System.out.println(a1.size());
		*/
		
		a2.add("one");
		a2.add("two");
		a2.add("three");
		a2.add("ajay");
		
		/*System.out.println(a2.size());*/
		
		Collections.copy(a2, a1);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a2.size()+"     "+a1.size());
	
	}

}
