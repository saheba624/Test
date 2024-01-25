class MYThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("child thread");
		}
	}
}

public class CreatingThreadsWithExtendingThredsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MYThread m = new MYThread();

		m.start();// this one will create new thread to call child run method
		//m.run(); // this will not create new thread for call child thread its just like to call methid

		for (int i = 0; i <= 5; i++) {
			System.out.println("main Thread");
		}
	}

}
