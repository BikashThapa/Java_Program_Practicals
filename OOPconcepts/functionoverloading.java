package OOPconcepts;
// Function Overloading example	
class A{
	double addition(double a, double b) {
		return a+b;
	}
	double addition(double a, double b,double c) {
		return a+b+c;
	}
}
public class functionoverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		double sum1 = obj.addition(3.5, 3.14);
		double sum2 = obj.addition(1.23,3.21,4.90);
		System.out.println("The sum1 is : "+sum1);
		System.out.println("The sum2 is :" + sum2);
	}
}
