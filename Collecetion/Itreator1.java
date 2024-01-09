package c1.collection;

import java.util.Iterator;
import java.util.Stack;

public class Itreator1 {
	public static void main(String[] args) {
		Stack s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		Iterator it=s.iterator();
		while(it.hasNext()){
			
			Object o=it.next();
			if(o.equals(3)){
				it.remove();
			}
		}
		System.out.println(s);
	}

}
