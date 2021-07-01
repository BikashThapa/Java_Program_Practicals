package ExceptionalHandlingExample;

public class throwsExample {
	
	static void divide(int a,int b) throws ArithmeticException{
		int result = a/b;
		System.out.println("The result is :"+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide(10,0);
		}catch(Exception e) {
			System.out.println(e);
		}	
	}

}
