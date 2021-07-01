package InheritanceJava;

 class Grandpa{
	 
	int amount = 21000;
	public void show() {
		System.out.println("Grandpa : "+ amount);
	}
}

 class Parent1 extends Grandpa{
	int amount = 100000;
	public void show1() {
		System.out.println("Parent : "+ amount);
	}
}

 class Children extends Parent1{
	int amount =5000;
	public void show2() {
		System.out.println("Me : "+ amount);
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Children ch1 = new Children();
		ch1.show2();
		ch1.show1();
		ch1.show();
	}
}
