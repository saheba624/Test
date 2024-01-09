package com.basic;

public class Fabonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int n=10;
		for(int i=2;i<n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c +"  ");
		}
		
	}

}
