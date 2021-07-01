package OOPconcepts;
// parent or super class
abstract class Shape{
	abstract void show();
}
//child class or sub class
class  Rectangle extends Shape{
	
	public void show() {
		System.out.println("This is inside Rectangle");
	}
}
// Child class or sub class
class Circle extends Shape{
	public void show() {
		System.out.println("This is inside Circle");
	}
}
public class Abstractionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Rectangle();
		Shape s1 = new Circle();
		
		s.show();
		s1.show();
		}
}
