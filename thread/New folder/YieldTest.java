class child extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("child");
		}

	}
}

public class YieldTest {
	public static void main(String[] args) {

		child c = new child();

		c.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main");
		}
	}
}
