package com.raystech.thread;

public class RacingThread extends Thread{
	public static Amount data=new Amount();
	public RacingThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
@Override
public void run() {
	for(int i=1;i<=4;i++){
		data.deposit(getName(), 1000);
	}
	
}
public static void main(String[] args) {
	RacingThread t1=new RacingThread("aj");
	RacingThread t2=new RacingThread("styl");
	t1.start();
	t2.start();
	
}
}
