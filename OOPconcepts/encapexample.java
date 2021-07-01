package OOPconcepts;
class Example{
	private String name;
	private int roll_number;
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNumber(int roll) {
		roll_number= roll;
	}
	public String getName() {
		return name;
	}
	public int getRollNumber() {
		return roll_number;
	}	
}
public class encapexample {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj = new Example();
		 obj.setName("Ram");
		 obj.setRollNumber(1);
		 System.out.println("name is :" + obj.getName() + " and roll is : " + obj.getRollNumber());
	}
}
