package StringsinJava;

public class StringhandlingFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Brock";
		// Making String object by using Parameter
		String name1 = new String("Brock"); 
		char ch[] = {'B','r','o','c','k'};
		// Making String object by using array of char as a Parameter
		String name2 = new String(ch);
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		// concatenation of strings example
		String name3 = name + name1;
		String name4 =name.concat(name2);
		System.out.println(name3);
		System.out.println(name4);
		//Chaning cases in java
		System.out.println(name3.toUpperCase());
		System.out.println(name4.toLowerCase());
		
		// Changing Other datatypes to String
		int a = 2021;
		String str = String.valueOf(a);
		String str1 = Integer.toString(a);
		System.out.println(str);
		System.out.println(str1);
		//Changing STring to Other datatypes
		
		String number = "2078";
		int newnum = Integer.parseInt(number); // Float.parseFloat(), Double.parseDouble()
		System.out.println(newnum);
		int c = newnum+21;
		System.out.println(c);
		
		int newnum1 = Integer.valueOf(number); // Float.valueof() , Double.valueof()
		System.out.println(newnum1);
		
		// substring in java
		String names = "Ram kaji Basyal";
		String subname = names.substring(4);
		String subname2  =names.substring(2, 8);
		System.out.println(subname);
		System.out.println(subname2);
		
		// comparing strings in java
		System.out.println(names.equals("Ram kaji basyal")); // checks cases as well 
		System.out.println(names.equalsIgnoreCase("Ram kaji basyal")); //  case sensitive
		
		
		
		
		}
}
