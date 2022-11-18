package beginner;
import java.util.*;
public class radix {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.matches("[0-1]*")) {
			System.out.println(2);
		}
		else if(str.matches("[0-7]*")) {
			System.out.println("8");
		}
		else if(str.matches("[0-9]*")) {
			System.out.println("10");
		}
		else if(str.matches("[0-9 A-F]+")) {	
			System.out.println(15);
		}
		else
		{
			System.out.println("Invalid number");
		}
	}

}
