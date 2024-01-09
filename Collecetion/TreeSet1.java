package c1.collection;

import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet set=new TreeSet<>();
	set.add(1);
	set.add(3);
	set.add(2);
	set.add(8);
	System.out.println(set.descendingSet() );
}
}
