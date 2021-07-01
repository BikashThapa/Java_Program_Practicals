package OOPconcepts;

class ABC{
	String Address;
	int phone_number;
	public ABC() {
		Address = null;
		phone_number = 0;
		}
	public ABC(String Address,int phone_number){
		this.Address = Address; 
		this.phone_number = phone_number; 
		}
	
}
public class thisexample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj = new ABC("kathmandu",212121);
		System.out.println(obj.Address + " " + obj.phone_number);
	}
}
