// Creating a new custom Thread and running own logic from overridden run().

public class Test extends Thread {
	@Override
	public void run() {
		System.out.println("run");
	}

	public static void main(String[] args) {
		Test th = new Test();
		th.start();
		System.out.println("main");
	}

}