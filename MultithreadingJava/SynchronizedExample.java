package MultithreadingJava;

class Counter{
	int count; 
	public synchronized void increment() { //lock unlock feature
		count++; 
	}
}

public class SynchronizedExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		Thread th1 = new Thread(new Runnable() { // lambda Expression
				public void run() {   // inline function
				for(int i =1;i<=1000;i++) {
					c1.increment();		
				}
			}
		});
		Thread th2 = new Thread(new Runnable() { // lambda Expression
			public void run() {   // inline function
			for(int i =1;i<=1000;i++) {
				c1.increment();		
			}
		}
	});
		th1.start();
		th2.start();
		
		th1.join(); // completes the thread statement fully
		th2.join();
		System.out.println("Count :: "+c1.count);
	
	}

}
