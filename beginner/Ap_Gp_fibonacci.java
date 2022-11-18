package beginner;
import java.util.*;
public class Ap_Gp_fibonacci {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a,d,n,r,s;
		a=sc.nextInt();
		d=sc.nextInt();
		n=sc.nextInt();
		r=n;
		s=0;
		/*while(r!=0) {
			System.out.print(a+" ");   //this is for A.P.
			s=a+d;
		    a=s;
			r--;
		}*/
		
		/*for(int i=0;i<n;i++){
			System.out.print(a+" ");  // this is for G.P
			a=a*d;
		}*/
		
		System.out.print(a+" ");
		System.out.print(d+" ");
		for(int i=0;i<n;i++)
		{
			s=a+d;
			System.out.print(s+" "); // fibonnaic series
			a=d;
			d=s;
			
		}
	}

}
