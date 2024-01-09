 package c1.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class stackCopy {
	public static void main(String[] args) {
		Stack s=new Stack<stackCopy>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		Stack s1=new Stack<>();
		ListIterator it=s.listIterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
		
		}
		while(it.hasPrevious()){
			Object aa=it.previous();
			s1.push(aa);
		
		}
		System.out.println(s1);
		
		/*ListIterator list=s.listIterator();
		while (list.hasNext()) {
			Object object = (Object) list.next();
		    System.out.print(object+"\t");
		}
		System.out.println();
		while (list.hasPrevious()) {
			Object object = (Object) list.previous();
					System.out.print(object+"\t");
					s1.push(object);
			
		}
		System.out.println(s1);*/
		/*Enumeration e=s.elements();
		while(e.hasMoreElements()){
			e.nextElement();
			Object f=s.peek();
			s1.push(f);
		}
		System.out.println(s1);
		*/
	/*	Object o1=s.peek();
		Object o2=s.peek();
		Object o3=s.peek();
		Object o4=s.peek();
		s1.push(o1);
		s1.push(o2);
		s1.push(o3);
		s1.push(o4);*/
		
	}

}
