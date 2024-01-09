package c1.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmap {
public static void main(String[] args) {
	HashMap hm=new HashMap<>();
	hm.put("1", "One");
	hm.put("3", "Three");
	hm.put("2", "three");
	hm.put(null, "Four");
	System.out.println(hm);
	hm.put("5", "five");
	System.out.println(hm);
	LinkedHashMap lm=new LinkedHashMap<>();
	lm.put("1", "One");
	lm.put("3", "Three");
	lm.put("2", "three");
	lm.put(null, "Four");
	System.out.println(lm);
}
}
