package InheritanceJava;
class Parent{
	String batch = "2019";
	String Department = "BCA";
	void show() {
		System.out.println(batch);
		System.out.println(Department);
	}
}
class Child extends Parent{
	String name;
	int roll ;
	public Child(String name,int roll) {
		super.show();
		this.name = name;
		this.roll = roll;
		}
	public void show12() {
		
		System.out.println(name);
		System.out.println(roll);
	}
}
public class SingleLevelInheritance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch1 = new Child("Ram",12);
		 // ch1.show12();
		//ch1.show();
	}
}
