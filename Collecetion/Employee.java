package c1.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	String name;
	Integer salary;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(String name,Integer salary) {
	// TODO Auto-generated constructor stub
	this.name=name;
	this.salary=salary;
}
	@Override
	public int compare(Employee o, Employee o1) {
		// TODO Auto-generated method stub
		if(o.salary>o1.salary){
			return -1;
		}
		else if (o.salary==o1.salary) {
			return 0;
			
		}
		else
		return 1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"   "+salary;
	}
	public static void main(String[] args) {
		Employee empl=new Employee();
		ArrayList a=new ArrayList<>();
		a.add(new Employee("aman", 1000));
		a.add(new Employee("vivek", 2000));
		a.add(new Employee("prakhar", 4000));
	Collections.sort(a,empl);
	for (Object object : a) {
		System.out.println(object);
		
	}
	}

}
