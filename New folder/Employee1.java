 package com.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Employee1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, IOException {
		Employee e1=new Employee();
		
		Employee e2=(Employee) Class.forName("com.basic.Employee").newInstance();
		
		Constructor cons=Employee.class.getConstructor();
		Employee e3=(Employee) cons.newInstance();
		
		Employee obj=new Employee();
		Employee e4=(Employee) obj.clone();
		
		FileInputStream on=new FileInputStream("C:/employee.ser");
		ObjectInputStream in=new ObjectInputStream(on);
	Employee e5=	(Employee) in.readObject();
	
	/*ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:/employee.ser"));
	out.defaultWriteObject();*/
	}

}
