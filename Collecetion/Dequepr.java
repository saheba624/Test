package c1.collection;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Dequepr {
	public static void main(String[] args) {
		Deque d=new LinkedList<>();
		d.addFirst("aman");		
		d.addLast("Raghuvanshi");
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		Iterator a=d.iterator();
		while(a.hasNext()){
			System.out.println(a.next());
		}
		System.out.println(d.peekFirst());
	}

}
