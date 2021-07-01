package UserInput;
import java.util.Scanner;


public class UserInputFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Name Here :: ");
		String name = scn.nextLine();

		System.out.println("Enter Roll Here :: ");
		int roll = scn.nextInt();
		//flot num = scn.nextFloat();
		
		System.out.println(" Name is :: " + name+" Roll is :: "+roll);

	}

}
