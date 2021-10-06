class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("---run start---");
		System.out.println("IN RUN 4-->" + this.getState());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---run end---");
	}
}

public class ThreadState {
	public static void main(String[] args) throws InterruptedException {
		MyThread2 mt2 = new MyThread2();
		System.out.println("---main start---");
		System.out.println("in main 1-->"+mt2.getState());
		mt2.start();
		System.out.println("in main 2-->"+mt2.getState());
		System.out.println("in main 3-->"+mt2.getState());
		Thread.sleep(2000);
		System.out.println("in main 5-->"+mt2.getState());
		Thread.sleep(3000);
		System.out.println("in main 6-->"+mt2.getState());
		System.out.println("---main end---");
	}

}
