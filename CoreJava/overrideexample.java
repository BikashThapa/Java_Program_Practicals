package CoreJava;



class Car{
	String name;
	int model_year ;
	public Car(){
	name = "Cars";
	model_year = 2015;
	}
	public Car(String name, int year) {
		this.name = name;
		model_year = year;
	}
	public static void example() {
		System.out.println("this is inside example Function");
	}
	
}

public class overrideexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car abc = new Car();
		Car abcde = new Car("tata",2018);
		System.out.println(abc.name + abc.model_year);
		System.out.println(abcde.name + abcde.model_year);
		Car.example();

	}

}
