package c1.collection;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ajm {
	public static void main(String[] args) {
		ArrayList a=new ArrayList(1);
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		Queue q=new PriorityQueue<>();
		q.add("one");
		q.add("two");
		q.add("three");
		q.offer("fgg");
		System.out.println(q);
		q.add("four");
		System.out.println(q);
		
		
	}

}
