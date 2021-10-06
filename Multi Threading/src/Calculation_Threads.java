// program to run two threads with Multiple sub classes with separate instance and calling start method
// This program have two threads with two different run methods.

class AddThread extends Thread {
	@Override
	public void run() {
		int res = 0;
		for (int i = 1; i <= 20; i++) {
			res += i;
			System.out.println(getName() + "--->Addition=" + res);
		}
	}

}

class SubThread extends Thread {
	@Override
	public void run() {
		int sub = 0;
		for (int i = 1; i <= 20; i++) {
			sub -= i;
			System.out.println(getName() + "--->Subtraction=" + sub);
		}
	}
}

public class Calculation_Threads {
	public static void main(String[] args) {
		AddThread at = new AddThread();
		SubThread st = new SubThread();
		at.start();
		st.start();
		System.out.println("main");
	}
}
