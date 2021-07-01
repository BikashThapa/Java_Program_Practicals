package ExceptionalHandlingExample;
import java.util.Scanner;
class MyException extends Exception{
	MyException(String msg){
		super(msg);
		System.out.println("This is User defined exception class :::");
	}
}
public class UserDefinedexceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in =new Scanner(System.in);
			System.out.println("Enter Age Here:: ");
			int age =in.nextInt();
			if(age < 18) {
				throw new MyException("Not valid age for voting");
			}
			System.out.println("Welcome to voting  System. Your age is : "+age+" You can vote now:");
		}catch(MyException e) {
			System.out.println(e);
			}
			catch(Exception e) {
			System.out.println(e);
			}finally {
				System.out.println("Thank you for visting Voting Center");
				
			}
		}
}
