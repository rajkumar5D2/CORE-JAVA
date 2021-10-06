// Program to run multiple threads with single sub class
// This program has single run method logic bus has multiple threads running with same logic.

class MyThread1 extends Thread {
	private int x;
	public MyThread1(int x) {
		this.x = x;
	}
	@Override
	public void run() {
		for (int i = 1; i <= x; i++)
			System.out.println(getName() + "->run-" + i);
	}
}

public class Multiple_Threads {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1(5);
		MyThread1 mt1 = new MyThread1(10);
		mt.start();
		mt1.start();
		System.out.println("main");
	}

}
