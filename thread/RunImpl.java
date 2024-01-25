package com.raystech.thread;

public class RunImpl implements Runnable {
	private String name=null;
	public  RunImpl(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			System.out.println(i+" :-  "+name);
		}
		
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new RunImpl("aj"));
		Thread t2=new Thread(new RunImpl("Styl"));
		t1.start();
		t2.start();
	}

}
