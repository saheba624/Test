package com.raystech.thread;

public class ExtandThread extends Thread {
	private String name = null;

	public ExtandThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "      " + name);
		}
	}

	public static void main(String[] args) {
		ExtandThread t1 = new ExtandThread("aman");
		ExtandThread t2 = new ExtandThread("ajay");
		t1.start();
		t2.start();
		for(int i=0;i<5;i++){
			System.out.println(i+"       "+"i am main");
		}

	}

}
