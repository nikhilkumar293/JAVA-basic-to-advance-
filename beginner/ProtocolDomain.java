package beginner;
import java.util.*;
public class ProtocolDomain {
	public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         int str1=str.indexOf("\\");
         String str2=str.substring(0,str1);
         System.out.println(str2);
         int sr3=str.lastIndexOf(".");
         String str4=str.substring(sr3+1);
         System.out.println(str4);
         if(str2.contains("https:")) {
        	 System.out.println("Hypertext Transfer Protocol");
         }
         else {
        	 System.out.println("it is a protocol");
         }
         if(str4.contains("com")) {
        	 System.out.println("Commerical website");
         }
         else
        	 System.out.println("Government website");
}
}
