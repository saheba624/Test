package c1.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrylistex {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add("aj");
		a1.add("styl");
		a1.add("romen");
		a1.add("rings");
	System.out.println(a1.size() );
	Iterator r=a1.iterator();
	while(r.hasNext()){
		System.out.println(r.next() );
	}
	a1.add(3, "aemo");

	for (Object object : a1) {
		System.out.println(object );
	}
	Collections.sort(a1);
	System.out.println(a1 +   " 4");
	Iterator am=a1.iterator();
	while(am.hasNext()){
		System.out.println(am.next());
	}
	a1.remove(2);
	System.out.println(a1);
	}
	

}
