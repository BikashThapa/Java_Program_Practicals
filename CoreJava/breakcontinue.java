package CoreJava;

public class breakcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 10; x<=20;x++) {
			
			if(x==15) {
				continue;
			}
			
			if(x==18) {
				break;
			}
			
			System.out.println("the value of X is :"  +x);
		}

	}

}
