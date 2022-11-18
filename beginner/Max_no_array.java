package beginner;
import java.util.*;
public class Max_no_array {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int max=0,max2=0;
		for(int i=0;i<n;i++)
		{
			if(max<A[i]) {
				max2=max;
				max=A[i];
			}
		}
		System.out.println(max2);
		
//		int s=sc.nextInt();
//		for(int i=0;i<n;i++)
//			{
//				if(s==A[i]) {
//					System.out.println(s+" found");
//					break;
//				}
//			}
	}
}
