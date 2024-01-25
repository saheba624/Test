class TestStart extends Thread {
	@Override
	public synchronized void start() {
		System.out.println("start");
	}

	@Override
	public void run() {
		System.out.println("run");
	}

}

public class OverideStartMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestStart st = new TestStart();

		st.start();// it will run just like normal method , this will not
					// cr4eate neew thrread
	}

}
