package beginner;
import java.util.*;
class Rectangle_1{
	double l;
	double h;
	public Rectangle_1() {
		l=1;
		h=1;
	}
	public Rectangle_1(double l1,double h1) {
		l=l1;
		h=h1;
	}
	double area;
	public double area()
	{
		area=l*h;
		System.out.println(area);
		return(area);
	}
}

public class Rectangle_constructor {
	public static void main(String[]args) {
	Rectangle_1 r=new Rectangle_1(10,5);
	r.area();
}
}
