package com.raystech.thread;

public class PriorityThread extends Thread{
	private String name=null;
	public PriorityThread(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			System.out.println(i+" :- "+name);
		}
	}
public static void main(String[] args) {
	PriorityThread t1=new PriorityThread("Thread#A");
	PriorityThread t2=new PriorityThread("Thraed#B");
	PriorityThread t3=new PriorityThread("Thread#C");
	t1.setPriority(3);
	t2.setPriority(1);
	t1.start();
	t2.start();
	t3.start();
}
}
