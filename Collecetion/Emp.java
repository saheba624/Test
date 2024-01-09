package c1.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Emp implements Comparator<Emp> {
	public String name;
	public int salary;

	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(String name,int salary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"          "+salary;
	}
	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.salary-(o2.salary);
	}
	//for descending Order
	/*@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		if(o1.salary>o2.salary){
			return -1;
		}else if(o1.salary==o2.salary){
			
		return 0;}else
			return 1;
	}*/
	public static void main(String[] args) {
		Emp e=new Emp();
		ArrayList a=new ArrayList<>();
		a.add(new Emp("ajay", 5000));
		a.add(new Emp("vijay", 1000));
		a.add(new Emp("Dhanjay",8000));
		Collections.sort(a,e);
		for (Object object : a) {
			System.out.println(object);
			
		}
		
	}

}
