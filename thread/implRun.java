package com.raystech.thread;

public class implRun implements Runnable{
	private String name=null;
			public implRun(String name){
		this.name=name;
	}
	
	
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(i+"  "+name);
		}
		
	}
 public static void main(String[] args) {
	Thread t1=new Thread(new implRun("aman"));
	Thread t2=new Thread(new implRun("ajay"));
	t1.start();
	t2.start();
}

}
