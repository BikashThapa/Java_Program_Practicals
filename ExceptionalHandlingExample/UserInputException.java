package ExceptionalHandlingExample;
import java.util.Scanner;

public class UserInputException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This try block might return InputMismatchexception and ArithmeticException
		try {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter First Number");
		int number1 = inp.nextInt();
		System.out.println("Enter Second Number");
		int number2 = inp.nextInt();
		int div = number1/number2;
		System.out.println("The result is :: "+div);
	}catch(Exception e) {//Exception handles all types of exception in java
		System.out.println(e);
	}finally {
		System.out.println("Inside finally::");//Always gets executed
		
	}
}
}
