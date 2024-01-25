package com.raystech.thread;

public class threadExtend extends Thread{
	private String name=null;
	public threadExtend(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			System.out.println(i+"  :-   "+ name);
		}
	}
	public static void main(String[] args) {
		threadExtend t1=new threadExtend("aj");
		threadExtend t2=new threadExtend("styl");
		t1.start();
		t2.start();
		
	}

}
