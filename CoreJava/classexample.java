package CoreJava;

class BCA{
	String name;
	int roll;
	public void myfunction() {
		System.out.println(" name is : "+ name + " Roll is :"+ roll);
	}
}
public class classexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is inside class example");
		BCA bca_3 = new BCA();
		bca_3.name ="xyz";
		bca_3.roll = 21;
		bca_3.myfunction();
	}
}
