package c1.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionMethod {
	public static void main(String[] args) {
		Collection c=new ArrayList<>();
		c.add("aja");
		c.add("gumne");
		c.add("chle");
	
		System.out.println(c.size());
		Iterator c1=c.iterator();
		while(c1.hasNext()){System.out.println(c1.next());}
		System.out.println(c.isEmpty());
		System.out.println(c.contains("aja"));
		System.out.println(c.containsAll(c));
		System.out.println(c.iterator());
		for (Object object : c) {
			System.out.println(object);
		}
		System.out.println(c.removeAll(c));
		System.out.println(c.size());
		
		
		
		
	}

}
