package MultithreadingJava;

public class GetSetPriorityThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetSetPriorityThread th1 = new GetSetPriorityThread();
		GetSetPriorityThread th2 = new GetSetPriorityThread();
		GetSetPriorityThread th3 = new GetSetPriorityThread();
		
		System.out.println("t1 thread priority is :"+th1.getPriority());
		System.out.println("t2 thread priority is :"+th2.getPriority());
		System.out.println("t3 thread priority is :"+th3.getPriority());
		
		th1.setPriority(2);
		th2.setPriority(8);
		th3.setPriority(MAX_PRIORITY);
		
		System.out.println("t1 thread priority is :"+th1.getPriority());
		System.out.println("t2 thread priority is :"+th2.getPriority());
		System.out.println("t3 thread priority is :"+th3.getPriority());
		
		
		System.out.println("Currently Executing Thread is :"+Thread.currentThread().getName());
		System.out.println("The initial Thread Priority is  :"+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("The Updated Thread Priority is  :"+Thread.currentThread().getPriority());
		
	}
	
}
