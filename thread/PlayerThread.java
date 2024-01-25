package com.raystech.thread;

public class PlayerThread extends Thread{
	public PlayerThread(ThreadGroup tg,String name) {
		// TODO Auto-generated constructor stub
		super(tg,name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++){
			String msg=getName();
			msg+="  played match #"+i;
			System.out.println(msg);
		}
	}
public static void main(String[] args) {
	ThreadGroup team=new ThreadGroup("Team India");
	PlayerThread p1=new PlayerThread(team, "Jay");
	PlayerThread p2=new PlayerThread(team, "vijay");
	p1.start();
	p2.start();
	System.out.println("Name:- "+team.getName());
	System.out.println("Active thread :- "+team.activeCount());
}
}
