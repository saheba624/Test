package com.basic;

public class Swap2No {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"    "+b);
		
		int x=75;
		int y=85;
		int z;
		z=y;
		y=x;
		x=z;
		System.out.println(x+"        "+y);
	}
	

}
