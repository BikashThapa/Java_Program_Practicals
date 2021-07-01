package ExceptionalHandlingExample;

public class ExceptionExampleFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = 10/0;
		int arr[] = {1,2,3,4,5};
		System.out.println("After code completion");
		System.out.println(a);
		System.out.println("After First Statement");
		System.out.println(arr[7]); // Exception occurs
		System.out.println("Finished");// Others statement does not run
		}catch(ArithmeticException e) {
			System.out.println("Inside Arithmetic Exception: Divided by Zero ");
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Invalid showing item from array");
		}catch(Exception e) {
			System.out.println("Inside main Exception Class");
		}finally {
			System.out.println(" All Finished");
		}
	}
}
