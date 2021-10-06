//	program to create and run custom Thread using Thread class.
public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("From run method");
		Example.m1();
		Example.m2();
	}
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		/* class Thread implements Runnable {
		 * @override
		 * public void run() {
		 * private runnable target; // variable that stores runnable object reference
		 * if(target!=null)			// Here target ==null
		 * target.run()				// Since there is no target variable reference This takes to run in MyThread
		 *  run() to execute our own logic
		 * */
		mt.start();
		/* start() has logic for hand overing current thread obj to JVM to start new thread and calling and executing run()
		 * beside main thread */
		System.out.println("main");
	}
}
