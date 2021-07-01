package CoreJava;

class Bikash{
	int a;
	float b;
	public Bikash() {
		a = 5;
		b = 3.24f;
		}
	public Bikash(int x,float z) {
		a = x;
		b=z;
	}
	void def() {
		System.out.println("this is me");
	}
	
}

public class constructorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bikash bb = new Bikash(21,21.05f);
		System.out.println(bb.a + ":: "+ bb.b);

	}

}
