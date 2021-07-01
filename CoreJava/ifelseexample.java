package CoreJava;

public class ifelseexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =20;
		int y = 7;
		int result = x % y;
		if(result == 0) {
			System.out.println(x + " is divided by " + y );
		}else if(result == 2){
			System.out.println(x + " is  divided by " + y +" having reminer 2");
		}else {
			System.out.println(x+" is not divided by "+y);
		}

	}

}
