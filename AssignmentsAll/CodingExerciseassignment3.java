package AssignmentsAll;
import java.util.Scanner;

public class CodingExerciseassignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the string Manipulation Program ::");
		System.out.println("Enter your name here :: ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("Welcome "+name+" in the String Manipulation Program");
		System.out.println("Setup your username and password here:: ");
		System.out.println("Enter your username here: ");
		String username = in.nextLine();
		System.out.println("Enter your password here: ");
		String pass = in.nextLine();
		
		System.out.println("Enter your username and password for validation: ");
		System.out.println("Enter your username here: ");
		String userin = in.nextLine();
		System.out.println("Enter your password here: ");
		String passin = in.nextLine();
		
		boolean isSame = (username.equals(userin))&&(pass.equals(passin)); //true and false == false
		// false and true == false 
		// true and true is true
		if(isSame) {
			System.out.println("Welcome to the String Manipulation Section");
			System.out.println("Enter  a string : ");
			String str1 = in.nextLine();
			System.out.println("String in Uppercase is "+str1.toUpperCase());
			System.out.println("String in Lowercase is "+str1.toLowerCase());
			System.out.println("The length of  "+str1+" is "+str1.length());
			
			}else {
				System.out.println("Invalid Username or Password, try agin....");
		}	
		
	}

}
