class TestStart2 extends Thread {

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("start");

	}

	@Override
	public void run() {
		System.out.println("run");
	}

}

public class OverrideStartCase2 {
	public static void main(String[] args) {

		TestStart2 ts = new TestStart2();

		ts.start();

	}
}
