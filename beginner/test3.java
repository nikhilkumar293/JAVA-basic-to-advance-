package beginner;
import java.util.Scanner; //code for removing all the symbols from string, remove extra spaces, find the total words in the strings;
public class test3 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		String str;
		str=sc.nextLine();
		System.out.println(str.replaceAll(" \\s+"," "));
		System.out.println(str.replaceAll("\\W",""));
		String words[]=str.split("\\s");
		System.out.println(words.length);
	}
}
