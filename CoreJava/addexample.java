package CoreJava;

class addnumbers{
	
	int add(int a ,int b) {
		int sum = a+b;
		return sum;
		 
	}
}
public class addexample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addnumbers addnew = new addnumbers();
		int result = addnew.add(21, 19);
		System.out.println("The addition is " + result);
		
		addnumbers addnew2 = new addnumbers();
		int result2 = addnew2.add(32, 13);
		System.out.println("The addition is " + result2);
	}

}
