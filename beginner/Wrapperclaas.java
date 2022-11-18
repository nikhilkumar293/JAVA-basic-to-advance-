package beginner;

public class Wrapperclaas {
	public static void main(String[]args) {
		Integer m4=Integer.bitCount(111);
		System.out.println(m4);
		Integer m1=Integer.parseInt("19191");
		System.out.println(m1);
		Float b=12.5f/0;
		System.out.println(b.isInfinite());
		Character a='A';
		System.out.println(a.charValue());
	}
}
