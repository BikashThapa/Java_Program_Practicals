package practicalClass;

public class FirstClass {
	
	
	int  sum(int a ,int b) {
		return a+b;
	}

	void sub(int a,int b) {
		int sub = a-b;
		System.out.println(sub);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		FirstClass obj1 = new FirstClass(); 
		int sum =obj1.sum(10, 20);
		System.out.println(sum);
		obj1.sub(10,5);
	}

}
