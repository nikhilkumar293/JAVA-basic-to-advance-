package beginner;
import java.util.*;
public class Insertion_deletion_Array {
  public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	a[0]=1;
	a[1]=4;
	a[2]=5;
	a[3]=6;
	a[4]=13;
	a[5]=23;
	int n=6;
	int index=2;
	int x=15;
    for(int i=n;i>index;i--) {
     a[i]=a[i-1];
	}
    a[index]=x;
    for(int i=0;i<10;i++) {
    	System.out.println(a[i]);
    }
  }
}
