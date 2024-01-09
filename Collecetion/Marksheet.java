package c1.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Marksheet implements Comparable<Marksheet>{
	public int rollNo;
	public String name;
    public int marks;
    public Marksheet() {
		// TODO Auto-generated constructor stub
	}
    public Marksheet(int rollNo,String name,int marks) {
    	
  		// TODO Auto-generated constructor stub,
    	this.rollNo=rollNo;
    	this.name=name;
    	this.marks=marks;
  	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return rollNo+"  "+name+"  "+"  "+ marks;
    }

	@Override
	public int compareTo(Marksheet o) {
		// TODO Auto-generated method stub
		return rollNo+(o.rollNo);
	}
	public static void main(String[] args) {
		Marksheet m=new Marksheet();
		ArrayList a=new ArrayList<>();
		a.add(new Marksheet(1, "rr", 20));
		a.add(new Marksheet(5, "jj", 60));
		a.add(new Marksheet(2, "kk", 40));
		 Collections.sort(a);
		 for (Object object : a) {
			 System.out.println(object);
			
		}
	}
}
