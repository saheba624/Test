package com.basic;

public class Memory1 {
public static void main(String[] args) {
	memory a=new memory();
	memory b=new memory();
	a=b;
	System.gc();
	Runtime.getRuntime().gc();
}
}
