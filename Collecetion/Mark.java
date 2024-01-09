package c1.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Mark implements Comparable<Mark> {
	String rollNo;
	String name;
	int marks;

	public Mark() {
		// TODO Auto-generated constructor stub
	}

	public Mark(String rollNo, String name, int marks) {
		// TODO Auto-generated constructor stub
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;

	}

	@Override
	public int compareTo(Mark o) {
		// TODO Auto-generated method stub
		return rollNo.compareTo(o.rollNo);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo + "  " + name + "  " + marks;
	}

	public static void main(String[] args) {
		Mark m = new Mark();
		ArrayList a = new ArrayList<>();
		a.add(new Mark("1", "aman", 60));
		a.add(new Mark("2", "naman", 70));
		a.add(new Mark("3", "raman", 50));
		Collections.sort(a);
		for (Object object : a) {
			System.out.println(object);

		}

	}

}
