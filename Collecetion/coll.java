package c1.collection;

import java.util.Collections;
import java.util.LinkedList;

public class coll {
	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add("1");
		l.add("2");
		l.add("5");
		l.add("4");
		System.out.println(l);
		System.out.println(l.get(l.size()/2));
		Collections.sort(l);
		
		System.out.println(l);
		System.out.println(l.get(l.size()/2-1));
		
	}

}
