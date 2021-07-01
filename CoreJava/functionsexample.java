package CoreJava;

public class functionsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main function");
		hello();
		double ans =  divison(7, 2);
		
		System.out.println( ans );

	}
	public static void hello() {
		
		System.out.println("This is hello function");
	}
	public static double divison( double a,double b) {
		
		return a/b;
	}
}
