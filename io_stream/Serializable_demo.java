package io_stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class students implements Serializable{
	private int rollno;
	private String name;
	private float avg;
	private String dept;
	public static int data=10;
	public transient int t;
	
	public students() {}
	
	public students(int r,String n,float a,String d) {
		rollno=r;
		name=n;
		avg=a;
		dept=d;
		data=500;
		t=500;
	}
	
	public String toString() {
		return "\n Students Details\n"+
	           "\n Roll "+rollno+
	           "\n Average "+avg+
	           "\n dept "+dept+
	           "\n Transient "+t+"\n";
	}
	
}



public class Serializable_demo {

	/*public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Jaya shree\\eclipse-workspace\\Basic_java\\src\\io_stream\\Student3.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		students s=new students(10,"john",89.9f,"cse");
		oos.writeObject(s);
		fos.close();
		oos.close();
		

	}*/
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Jaya shree\\eclipse-workspace\\Basic_java\\src\\io_stream\\Student3.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		students s=(students)ois.readObject();
		System.out.println(s);
	
	    fis.close();
	    ois.close();
		

	}
	

}
