package c1.collection;

import java.util.LinkedList;

public class LinkedListMiddleNode {
public static void main(String[] args) {
	LinkedList list=new LinkedList<>();
			list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(6);
	list.add(5);
	
	System.out.println(list);
	int size=list.size();
	int size1=list.size()/2;
	if(size%2==0){
		System.out.println(list.get(size1-1));
	}
	else
		System.out.println(list.get(size1));
}
}
