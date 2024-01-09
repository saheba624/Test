package c1.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSst {
	public static void main(String[] args) {
		HashSet s=new HashSet<>();
		s.add("one");
		s.add("four");
		s.add("two");
		s.add("two"); 
		s.add(null);
		
		
	/*	Iterator it=s.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}*/
		System.out.println(s);
		TreeSet t=new TreeSet<>();
		t.add("one");
		t.add("four");
		t.add("two");
		t.add("");
		t.add("one");
		System.out.println(t);
		LinkedHashSet l=new LinkedHashSet<>();
		l.add("one");
		l.add("four");
		l.add("two");
		l.add(null);
		System.out.println(l);
		
		
	}

}
