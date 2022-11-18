package beginner;
import java.util.*;//Find whether the number s decimal or not, hexadecimal or not, date format or not;
public class test2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s2=sc.nextLine();
		int s1=sc.nextInt();
		String s=s1+"";
		System.out.println(s.matches("[0-1]*"));
		System.out.println(s.matches("[0-9 A-F]+"));
		
		System.out.println(s2.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
	}

}
