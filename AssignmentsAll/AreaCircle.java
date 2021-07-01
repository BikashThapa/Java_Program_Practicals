package AssignmentsAll;

import java.util.Scanner;

class Circle{
	double area(double r) {
		return Math.PI*r*r;
	}
}
class Cylinder extends Circle{
	
	double volume(double r,double h) {
		return super.area(r)*h;
		}
}
public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Radius here");
		double r = scn.nextDouble();
		System.out.println("Enter Height here");
		double h = scn.nextDouble();
		
		Cylinder cyl = new Cylinder();
		double area = cyl.area(r);
		double volume = cyl.volume(r, h);
		
		System.out.println("The area of Circle having radius "+ r+" is "+area+" cm^2");
		System.out.println("The Volume of Cylinder having height "+ h+" is "+volume+" cm^3");
		
	}
}
