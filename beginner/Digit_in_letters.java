package beginner;
import java.util.*;
public class Digit_in_letters {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in) ;
			int n=sc.nextInt();
			int r=0,rev=0;
			String Rev="";
			while(n!=0) {
				r=n%10;
				rev=(rev*10)+r;
				Rev=Rev.valueOf(rev);
				n=n/10;
			}
			System.out.println(Rev);
			
			for(int i=Rev.length()-1;i>=0;i--) {
				int s=Rev.charAt(i);
				
				switch(s) {
				case '1': System.out.print("one ");
				break;
				
				case '2': System.out.print("Two ");
				break;
				
				case '3': System.out.print("Three ");
				break;
				case '4': System.out.print("Four ");
				break;
				case '5': System.out.print("Five ");
				break;
				case '6': System.out.print("Six ");
				break;
				case '7': System.out.print("Seven ");
				break;
				case '8': System.out.print("Eight ");
				break;
				case '9': System.out.print("Nine ");
				break;
				case '0': System.out.print("Zero ");
				break;
				
				}
			}
	}

}
