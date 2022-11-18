package beginner;
import java.util.*;
import java.lang.*;
public class Pattern1 {
	public static void main(String[]args) {
		int s=0,sum=0;
		/*for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
	            
				System.out.format("%2d ",(s+j+1));
				sum=s+j+1;
			}
			s=sum;
			System.out.println();
		}*/
		/*for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
	            
				System.out.format("%2d ",(s+j+1));
				sum=s+j+1;
			}
			s=sum;
			System.out.println();
		}*/
		/*for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
	            
				System.out.format("%2d ",j+1);
				
			}
			System.out.println();
		}*/
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j>5)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
