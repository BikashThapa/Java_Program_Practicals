package OOPconcepts;

class Account{
	private long acc_no;
	private String name, email;
	private float amount;
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setAmount( float amount) {
		this.amount = amount;
	}
	public float getAmount() {
		return amount;
	}
}
public class EncapExample2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.setAcc_no(210019008);
		obj.setName("Ram Parsad pandit");
		obj.setEmail("ram2021@gmail.com");
		obj.setAmount(25430.21f);
		
		float new_amount = (float) (obj.getAmount() + obj.getAmount()*.10);
		System.out.println(obj.getAcc_no()+ " :: " +obj.getName() + " :: " +obj.getEmail()+" :: "+ new_amount);

	}

}
