package c1.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ImpSet {
	public static void main(String[] args) {
		/*
		 * HashSet set=new HashSet<>(); set.add("one"); set.add("three");
		 * set.add(null); set.add("four"); System.out.println(set); TreeSet
		 * set1=new TreeSet<>(); set1.add("one"); set1.add("three");
		 * set1.add("four"); System.out.println(set1); LinkedHashSet set2=new
		 * LinkedHashSet<>(); set2.add("one"); set2.add("three");
		 * set2.add("four"); set2.add(null); System.out.println(set2);
		 * LinkedList list=new LinkedList<>(); list.add("one"); list.add("two");
		 * list.add("three"); list.add("four");
		 * 
		 * long size=list.size(); long size1=size/2; if(size%2==0){
		 * System.out.println(list.get((int) size1-1));
		 * 
		 * }else { System.out.println(list.get((int) size1)); } SortedSet
		 * set3=new TreeSet<>(); set3.add("one"); set3.add("two");
		 * set3.add("three"); set3.add("four"); System.out.println(set3);
		 * HashMap map=new HashMap<>(); map.put(1, "one"); map.put(2, "two");
		 * map.put(3, "three"); map.put(0, ""); System.out.println(map); TreeMap
		 * map1=new TreeMap<>(); map1.put(1, "one"); map1.put(2, "two");
		 * map1.put(3, "three"); map1.put(4, "four"); System.out.println(map1);
		 * LinkedHashMap map2=new LinkedHashMap<>(); map2.put(1, "one");
		 * map2.put(2, "two"); map2.put(3, "three"); map2.put(0, "");
		 * System.out.println(map2); Queue q=new LinkedList<>(); q.add("one");
		 * q.offer("two"); q.add("three"); System.out.println(q); Queue q1=new
		 * PriorityQueue<>(); q1.add("one"); q1.add("two");
		 * 
		 * System.out.println(q1);
		 */Stack s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		Object o1 = s.pop();
		Object o2 = s.pop();
		Object o3 = s.pop();
		Object o4 = s.pop();
		Stack s1 = new Stack<>();
		s1.push(o1);
		s1.push(o2);
		s1.push(o3);
		s1.push(o4);
		
		
		//System.out.println(s1);
		//System.out.println(s1.size());
		Enumeration en = s1.elements();
		while (en.hasMoreElements()) {
			System.out.println(s1.pop());
			//en.nextElement();
		}
		//System.out.println(s1.size());

		/*
		 * int i=s1.size(); for(int j=1;j<=i;j++){ System.out.println(s1.pop());
		 * } System.err.println(s1.size());
		 */
		/*
		 * Iterator it = s1.iterator(); while(it.hasNext()){ it.next();
		 * System.out.println(s1);
		 * 
		 * }
		 */

		/*
		 * int size=s1.size(); for(Object obj: s1){ if(s1.size()>=0){
		 * System.out.println(s1.pop()); } }
		 * 
		 * 
		 * System.out.println(s1.size()); Enumeration en=s1.elements();
		 * while(en.hasMoreElements()){ System.out.println(s1.pop());
		 * en.nextElement();
		 * 
		 * } int i= s1.size(); for(int j=1;j<=i;j++){ s1.pop(); }
		 * System.out.println(s1.size());
		 */

	}

}
