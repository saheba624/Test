package com.basic;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Number is");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println("no is even");
		}
		else {
			System.out.println("no is odd");
		}
	}

}
