package beginner;
import java.util.*;
public class Factorial {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in) ;
		int product=5;
		for(int i=product-1;i>=1;i--) {
			product=product*i;
		}
		System.out.println(product);
	}

}
