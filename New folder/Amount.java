package com.raystech.thread;

public class Bubble {
	public static void main(String[] args) {
		int a[]={11,15,2,1,9,7,8,4};
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}

}
