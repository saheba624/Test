package c1.collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {
	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add("1");
		v.add("2");
		Enumeration e=v.elements();
		v.add("D");
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		

	}}
