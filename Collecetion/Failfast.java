package c1.collection;

import java.util.Iterator;
import java.util.Vector;

public class Failfast {
	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add("1");
		v.add("2");
		
		Iterator i=v.iterator();
		v.add("4");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}
