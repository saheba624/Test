package com.basic;

public class Secondlarge {
public static void main(String[] args) {
	int a[]={11,22,55,99,100,120,5,98};
	int large=a[0];
	int secondLarge=0;
	for(int i=0;i<a.length;i++){
		if(a[i]>large){
			
			secondLarge=large;
			large=a[i];
		}
		if(a[i]<large &&  a[i]>secondLarge){
			secondLarge=a[i];
		}
				
	}
	System.out.println(secondLarge);
}
}
