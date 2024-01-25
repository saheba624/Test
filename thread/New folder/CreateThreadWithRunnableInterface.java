class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run");
	}

}

public class CreateThreadWithRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread2 th = new Thread2();

		Thread t = new Thread(th);
		
		t.start();
	}

}
