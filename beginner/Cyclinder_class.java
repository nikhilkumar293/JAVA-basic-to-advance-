package beginner;
import java.util.*;
class Cyclinder{
	double r;
	double h;
	
	public double volume(double r,double h)
	{
		double area=(2*3.14*r*r)/h;
		return area;
	}
}

public class Cyclinder_class {
	public static void main(String []args) {
   Scanner sc=new Scanner(System.in);
   Cyclinder c=new Cyclinder();
   double r=sc.nextDouble();
   double h=sc.nextDouble();
  
   
   System.out.println(c.volume(r, h));
  
}
}