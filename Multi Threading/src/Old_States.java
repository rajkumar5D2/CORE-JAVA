class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println("in run");
		System.out.println(this.getState()+" --->run 3---> "+ this.isAlive());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" ---run end---");
		
	}
}
public class Old_States {
	public static void main(String[] args) {
		System.out.println("---main start---");
		MyThread3 mt3 = new MyThread3();
		System.out.println(mt3.getState()+" -->main 1 -->"+mt3.isAlive());
		mt3.start();
		System.out.println(mt3.getState()+" -->main 2 -->"+mt3.isAlive());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(mt3.getState()+" -->main 4--> "+mt3.isAlive());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(mt3.getState()+" --->main 6---> "+ mt3.isAlive());
		System.out.println("---main end---");
	}

}
