// Creating and running a new thread concurrently to main thread using runnable interface.

public class MyRunnable implements Runnable{ 	// run method resides in Runnable interface
	@Override
	public void run() {
		System.out.println("From run method");
		Thread th = Thread.currentThread();
		System.out.println(th.getName());
		Example.m1();
		Example.m2();
	}

		public static void main(String[] args) {
			MyRunnable mr = new MyRunnable();		
			Thread th = new Thread(mr);				// runnable does not contain start() so using Thread class with Runnable obj reference
			th.start();								// starting custom Thread for Thread class with Runnable obj reference.
			/* class Thread implements Runnable {
			 * @override
			 * public void run() {
			 * private runnable target; // variable that stores runnable object reference
			 * if(target!=null)
			 * target.run()				// This takes to run MyRunnable run() to execute our own logic
			 * */
			System.out.println("main");
		}
}
