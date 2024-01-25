class MY1 extends Thread {

	@Override
	public void run() {

		super.start();// even we cant call start from run method
		for (int i = 0; i <= 5; i++) {
			System.out.println("child thread");
		}
	}
}

public class ThrowingExceptionInThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MY1 m = new MY1();

		m.start();

		m.start();// we cant start one thread two times otherwise get exception
	}

}
