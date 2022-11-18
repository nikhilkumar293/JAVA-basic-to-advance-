package beginner;
import java.util.*;
class student{
	private String rollno;
	private static int count=1;
	private String generaterollno() {
		Date d=new Date();
		String rn=(d.getYear()+1900)+"BCE"+count;
		count++;
		return rn;
		
	}
	public student() {
		rollno=generaterollno();
	}
	
	public String getrollno() {
		return rollno;
	}
}

public class StaticTest {
  public static void main(String[]args) {
	  student n=new student();
	  System.out.println(n.getrollno());
  }
}
