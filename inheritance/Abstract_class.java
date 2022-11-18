package inheritance;
import java.util.*;
abstract class shape{
	abstract int perimeter();
	abstract int area();
}

class Circle extends shape{
	int r;
	@Override
	int perimeter() {
		return 2*r;
	}
	@Override
	public int area() {
		return 3*r*r;
	}
}

class rectangle extends shape{
	int l,b;
	@Override
	public int perimeter() {
		return 2*(l+b);
	}
	@Override
	public int area() {
		return l*b;
	}
}

public class Abstract_class {
	public static void main(String[]args) {
		Circle s=new Circle();
		rectangle s1=new rectangle();
		s1.l=10;
		s1.b=10;
		s.r=7;
		 shape sc=s;
		 shape sc2=s1;
		 System.out.println(sc.area());
		 System.out.println(sc2.area());
		
		
		
	}

}
