package com.basic;

public class large {
	public static void main(String[] args) {
		int a[]={145,29,11,95,85};
		int large=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>large){
				large=a[i];
			}
		}
		System.out.println(large);
	}

}
