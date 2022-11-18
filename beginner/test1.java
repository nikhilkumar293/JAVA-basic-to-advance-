package beginner; //Find if the email id is on Gmail, Find username and Domain name from email
import java.util.*;
public class test1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int str2=str.lastIndexOf("@");
        String s1=str.substring(0,str2);  
        String s2=str.substring(str2+1);
        System.out.println("Account name = "+s1);
		boolean str1=str.endsWith("@gmail.com");
		if(str1==true)
		{
			System.out.println("Its a Gmail account");
		}
		
        else {
        System.out.println("Domain name = "+s2);}
	}

}
