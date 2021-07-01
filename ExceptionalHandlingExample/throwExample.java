package ExceptionalHandlingExample;

public class throwExample {

	static void demoprogram() {
		
		try {		
			throw new ArithmeticException("This is in demo program");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demoprogram();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		}

}
