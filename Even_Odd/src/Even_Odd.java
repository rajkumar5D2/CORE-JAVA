
class EvenOrOdd{
		
		public synchronized void evenNum() {
			for(int i = 1; i<=10; i++) {
				try{
					if(i%2!=0) {
						wait();
					}
					if(i%2==0) {System.out.println(Thread.currentThread().getName()+" Even: "+i);
					}notify();
				}catch(Exception e) {System.out.println("Exception Handled: "+e);
					}
			
			}
		}
		
		public synchronized void oddNum() {
			for(int i=1;i<=10;i++) {
				try{
					if(i%2==0){
						wait();
					}
					if(i%2!=0) {System.out.println(Thread.currentThread().getName()+" Odd : "+i);
					}notify();
				}catch(Exception e) {System.out.println("Exception Handled: "+e);
					}	
			}
		}
}

class Even_Thread implements Runnable{
		EvenOrOdd e;
		
			public Even_Thread(EvenOrOdd e){
					this.e = e;
			}
				
			
			public void run() {
				e.evenNum();
			}
}


class Odd_Thread implements Runnable{
	EvenOrOdd e;
	
	public Odd_Thread(EvenOrOdd e){
		this.e = e;
	}
	
	public void run() {
		
		e.oddNum();
			
		}
	}


public class Even_Odd {
	public static void main(String[] args) {
			EvenOrOdd e = new EvenOrOdd();
			Thread t1 = new Thread(new Even_Thread(e));
			Thread t2 = new Thread(new Odd_Thread(e));
				
			t1.start();
			t2.start();
	}
}
