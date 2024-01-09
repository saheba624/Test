package c1.collection;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTable {
	public static void main(String[] args) {
		Hashtable ht=new Hashtable<>();
		ht.put("1","one" );
		ht.put("5", "five");
		ht.put("2", "two");
		ht.put("4", "four");
		ht.put("3", "three");
	System.out.println(ht);
	}

}
