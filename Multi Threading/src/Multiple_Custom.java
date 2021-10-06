class MyThread4 extends Thread {
	@Override
	public void run() {
		MyThread5 mt2 = new MyThread5();
		mt2.start();
		System.out.println("in thread-0");
		System.out.println(getName()+" after setting priority is "+getPriority());
	}
}

class MyThread5 extends Thread {
	@Override
	public void run() {
		System.out.println("in thread-1");
		System.out.println(getName()+" priority is "+getPriority());
	}
}

public class Multiple_Custom {
	public static void main(String[] args) {
		System.out.println("in main");
		MyThread4 mt1 = new MyThread4();
		System.out.println(mt1.getName()+"-->"+mt1.getPriority()+"-->before setting priority");
		mt1.start();
		mt1.setPriority(9);
		System.out.println();
	}

}
