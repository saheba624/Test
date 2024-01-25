class ThreadPriority extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.println("run");
		}
	}
}

public class settingPriorityThread {

	public static void main(String[] args) {
		ThreadPriority p = new ThreadPriority();

		p.setPriority(10);

		p.start();

		for (int i = 0; i < 50; i++) {
			System.out.println("main");
		}
	}
}
