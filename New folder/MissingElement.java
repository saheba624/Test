package com.basic;

public class MissingElement {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]={1,2,3,9,8};
	
		for(int i=0;i<a.length;i++){	
			boolean flag=true;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					flag=false;
					
				}
			}
			if(flag==true){
				System.out.println(a[i]+"   "+ b[i]);
			}
		}
	}

}
