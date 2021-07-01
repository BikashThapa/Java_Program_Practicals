package InheritanceJava;
class A{
	int i;
	public void show() {
		System.out.println("This is inside A class");
	}
}
class B extends A{
	int i;
	public B(int a,int b){
		super.i = a;
		i = b;
		}
	public void show() {
		super.show();
		System.out.println("The value of Parent is : "+super.i);
		System.out.println("The vakue od Child is :: " + i);
	}
}

class C extends A{
	int i;
	public C(int a,int b){
		super.i = a;
		i = b;
		}
	public void show() {
		super.show();
		System.out.println("The value of Parent is : "+super.i);
		System.out.println("The vakue od Child is :: " + i);
	}
}

public class HierarchicalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj1 = new B(21,2);
		obj1.show();
		C obj2 = new C(21,3);
		obj2.show();
	}

}
