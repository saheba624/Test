class Test extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run  with default args");
		}
	}

	public void run(int i) {

		for (int j = 0; j < 5; j++) {
			System.out.println("run  with one  args");
		}
	}
}

public class OverLoadedRunMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Test t = new Test();
		
		t.start();// this will always call no args default method
		t.run(1);// we have to explicitly call overloaded emthiod
	}

}
