package OOPconcepts;
class study{
	String name ;
	int roll;
	// Default Constructor
	public study() {
		name = "No name";
		roll = 0;
		}
	// Parameterized constructor
	public study(String n,int r) {
		name = n;
		roll = r;
		}
}
public class constructoroverload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study obj = new study();
		study obj1 = new study("Ram",5);
		obj1.name = "Shyam";
		obj1.roll = 21;
		System.out.println("name is : "+obj.name + " Roll is : "+ obj.roll);
		System.out.println("name is : "+obj1.name + " Roll is : "+ obj1.roll);
	}
}
