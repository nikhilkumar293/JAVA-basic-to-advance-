package beginner;
import java.util.*;
class Rectangle2{
	double length;
	double breadth;
	
	public double area(double length,double breadth) {
		double area;
		area=length*breadth;
		return area;
		
	}
	
}

public class Rectangle0_Class {
	public static void main(String [] args) {
		Rectangle2 r=new Rectangle2();
		Scanner sc=new Scanner(System.in);
		double l=sc.nextDouble(); 
		double b=sc.nextDouble();
		
		r.length=l;
		r.breadth=b;
		
		System.out.println(r.area(l, b));
	}

}
