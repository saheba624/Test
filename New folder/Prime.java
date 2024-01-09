package com.basic;

public class Prime {
	public static void main(String[] args) {
		int no=7;
		boolean flag=true;
		for(int i=2;i<=no/2;i++){
			if(no%i==0){
				System.out.println("no is not prime");
				flag=false;
			}
		}
		if(flag==true){
			System.err.println("no is a prime");
		}
		
	}

}
