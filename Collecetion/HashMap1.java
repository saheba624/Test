package c1.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.TreeMap;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap map=new HashMap<>();
		
		map.put(4, "ajay");
		map.put(2,"vijay");
		map.put(null, "emo");
		
		System.out.println(map.size()); 
		System.out.println(map);
		System.out.println(map.get(1));
		TreeMap m=new TreeMap<>();
		m.put("1", "one");
		m.put("2", "one");
		m.put("5", "one");
		m.put("4", "one");
		System.out.println(m);
		Hashtable t=new Hashtable<>();
		t.put("1", "one");
		t.put("2", "two");
		t.put("5", "three");
		t.put("4", "four");
		System.out.println(t);
		LinkedHashMap lm=new LinkedHashMap<>();
		lm.put("1", "one");
		lm.put("2", "two");
		lm.put(null, "three");
		lm.put("4", "four");
		System.out.println(lm);
		Properties p=new Properties();
		
	
	}

}
