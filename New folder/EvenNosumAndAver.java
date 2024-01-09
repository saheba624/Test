package com.basic;

public class EvenNosumAndAver {
	public static void main(String[] args) {
		int sum=0;
		double avr=0;
		
		for(int i=1;i<=50;i++){
			if(i%2==0){
				sum=sum+i;
				System.out.println(i);
				
			}
			
			
		}
		System.out.println(sum);
		avr=sum/25;
		System.out.println(avr);
	}

}
