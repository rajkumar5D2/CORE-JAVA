
class Example1 {
	public void m1() {
		Thread th = Thread.currentThread();
		String name = th.getName();
		if (name.equals("Thread-0")) {
			System.out.println("hi-->" +name);
		} else if (name.equals("Thread-1")) {
			System.out.println("hello-->" + name);
		} else if (name.equals("Thread-2")) {
			th.setPriority(9);
		}else 
			System.out.println("currently running thread is:"+ name);

	}

}
	class MyThread6 extends Thread {
		@Override
		public void run() {
			Example1 e = new Example1();
			e.m1();
		}
	}
public class Current_Thread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main started");
		Example1 e = new Example1();
		e.m1();
		MyThread6 mt1 = new MyThread6();
		MyThread6 mt2 = new MyThread6();
		MyThread6 mt3 = new MyThread6();
		
		mt1.start();
		mt2.start();
		mt3.start();
		Thread.sleep(2000);
		System.out.println(mt3.getPriority());
		System.out.println("main ended");
	}
}
