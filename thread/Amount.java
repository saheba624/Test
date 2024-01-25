package com.raystech.thread;

public class Amount {
	private int balance=0;

	public int getBalance() {
		dataBaseDelay();
		return balance;
	}

	public void setBalance(int balance) {
		dataBaseDelay();
		this.balance = balance;
	}
	public synchronized void deposit(String msg,int amt){
		int bal=getBalance()+amt;
		setBalance(bal);
		System.out.println(msg+" new balance :- "+bal);
	}
	public void dataBaseDelay(){
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
  
}
