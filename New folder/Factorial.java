package com.basic;

public class Factorial {
	public static void main(String[] args) {
	
		
		for(int i=2;i<=10;i++){
			int sum=1;
			for(int j=i;j>1;j--){
				sum=sum*j;
			}
			System.out.print(sum+ " ");
			
		}
		
	}

}
