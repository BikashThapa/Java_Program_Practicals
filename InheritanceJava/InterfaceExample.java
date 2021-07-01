package InheritanceJava;

interface Animals{
	String Section ="2019 BCA";
	 abstract public void Sound();
	 int roll=21;
	 abstract public void make();
}
class Pig implements Animals{
	public void Sound() {
		System.out.println("Pig Says wee wee");
	}
	public void make() {
		System.out.println("Pig Says");
	}
}


public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Pig p = new Pig();
			p.Sound();
	}

}
