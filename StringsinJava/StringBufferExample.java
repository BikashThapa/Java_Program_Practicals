package StringsinJava;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sbf = new StringBuffer("Shyam");
		// appending string in the sbf object
		
		 sbf.append(" Nath");
		  System.out.println(sbf);
		 
		 // replace function 
		  sbf.replace(3, 6, "In");
		  System.out.println(sbf);
		  
		  // reversing the string in java
		  
		  sbf.reverse();
		  System.out.println(sbf);
		  
		  // length of a stringBuffer
		   System.out.println(sbf.length());
		   
		  // sunstring in StringBuffer Class
		  System.out.println(sbf.substring(2, 6));
		  System.out.println(sbf.substring(4));
		  
		 //delete the characters from the string itself
		 sbf.delete(0, 3);
		 System.out.println(sbf);
		}
}
