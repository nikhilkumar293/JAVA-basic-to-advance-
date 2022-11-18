package beginner;
import java.util.Scanner;
public class Digit_count_armstrong_reverse {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n;
		int count=0,r=0,arm=0,rev=0;
		while(n!=0) {
			r=n%10;
			System.out.println(r);
			arm=arm+(r*r*r);
			rev=(rev*10)+r;
			n=n/10;
			count++;
		}
		System.out.println(rev);
		System.out.println(count);
		System.out.println(arm);
		if(arm == n1) {
			System.out.println("Yes its a Armstrong number");
		}
		else {
			System.out.println("Nope");
		}
		if(rev==n1) {
			System.out.println("Palindrom number");
		}
		else {
			System.out.println("NOpe");
		}
	}

}
