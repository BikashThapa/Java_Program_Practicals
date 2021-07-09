package MultithreadingJava;
class First implements Runnable{
	 public void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("First");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
class Second implements Runnable{
	public void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("Second");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First obj1 = new First();
		Second obj2 = new Second();
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		
		th1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();
	}

}
