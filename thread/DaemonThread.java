package com.raystech.thread;

public class DaemonThread extends Thread{
@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("Daemon T thread Started "+ Thread.currentThread());
	while(true){
		try {
			Thread.sleep(1000);
			System.out.println("Daemon T :- woke up again");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public static void main(String[] args)  {
	DaemonThread t=new DaemonThread();
	t.setDaemon(true);
	t.start();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Leaving main method");
	System.out.println("Now Jvm Will exist");
}
}
