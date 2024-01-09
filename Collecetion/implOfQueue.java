package c1.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class implOfQueue {
	public static void main(String[] args) {
		Queue q=new LinkedList<>();
		q.add("one");
		q.offer("two");
		q.add("three");
		q.add(1);
		System.out.println(q);
		Queue a=new PriorityQueue<>();
		a.add("one");
		a.offer("two");
		a.add("three");
		//a.add("");
		System.out.println(a);
		a.add("four");
		System.out.println(a);
		Deque d =new LinkedList<>();
		d.add("one");
		d.offer("two");
		d.add("three");
		d.add(1);
		System.out.println(d);
		Deque du=new ArrayDeque<>();
		du.add("one");
		du.offer("two");
		du.add("three");
		du.add("one");
		du.add(1);
		du.add(null);
		System.out.println(du);
		
	}

}
