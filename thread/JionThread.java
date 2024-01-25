
package com.raystech.thread;

public class JionThread extends Thread {
	String name = null;

	public JionThread(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "   " + name);
		}
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		JionThread j1=new JionThread("aj");
		JionThread j2= new JionThread("Styl");
		JionThread j3=new JionThread("singh");
		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j2.start();
		j3.start();
	}

}
