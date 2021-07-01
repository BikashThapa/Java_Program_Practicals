package AssignmentsAll;
import java.util.Scanner;

class Solution{
	double num1;
	double num2;
	Solution(double n1,double n2){
		num1 = n1;
		num2 =n2;	
	}
	double add() {
		return num1+num2;
	}
	double sub() {
		return num1-num2;
	}
	double mul() {
		return num1*num2;
	}
	double div() {
		return num1/num2;
	}
	
}
public class PracticalExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a =1;
		do {
		
		System.out.println("What do you want to perform: ");
		System.out.println("Enter 1 : to do Addition ");
		System.out.println("Enter 2 : to do Substraction ");
		System.out.println("Enter 3 : to do Multiplication ");
		System.out.println("Enter 4 : to do Division ");
		System.out.println("Enter 5 : to exit ");
		int value = in.nextInt();
		
		switch(value) {
				
			case 1:
				System.out.println("Welcome to addition section");
				System.out.println("Enter first Number ");
				double number1 = in.nextDouble();
				System.out.println("Enter Second Number ");
				double number2 = in.nextDouble();
				Solution s1 = new Solution(number1,number2);
				System.out.println("The addition between "+number1+" and "+number2+" is "+s1.add());
				break;
				
			case 2:
				System.out.println("Welcome to Subtraction section");
				System.out.println("Enter first Number ");
				double number11 = in.nextDouble();
				System.out.println("Enter Second Number ");
				double number21 = in.nextDouble();
				Solution s2 = new Solution(number11,number21);
				System.out.println("The Subtraction between "+number11+" and "+number21+" is "+s2.sub());
				break;
				
			case 3:
				System.out.println("Welcome to Multiplication section");
				System.out.println("Enter first Number ");
				double number12 = in.nextDouble();
				System.out.println("Enter Second Number ");
				double number22 = in.nextDouble();
				Solution s3 = new Solution(number12,number22);
				System.out.println("The Multiplication between "+number12+" and "+number22+" is "+s3.mul());
				break;
				
			case 4:
				System.out.println("Welcome to Division section");
				System.out.println("Enter first Number ");
				double number13 = in.nextDouble();
				System.out.println("Enter Second Number ");
				double number23 = in.nextDouble();
				Solution s4 = new Solution(number13,number23);
				System.out.println("The Multiplication between "+number13+" and "+number23+" is "+s4.div());
				break;
				
			case 5:
				a = 2;
				System.out.println("The infinite loop is terminated ");
				break;
			
			default:
				System.out.println("Please Enter Valid number between 1 and 5 Only");
		
		}
		
	}while(a==1); 
		
	}
}
