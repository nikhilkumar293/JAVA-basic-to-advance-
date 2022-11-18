package io_stream;
import java.io.*;

class Student{
	int rollno;
	String name;
	float avg;
	String dept;
}


public class DataStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//writing in a file
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Jaya shree\\eclipse-workspace\\Basic_java\\src\\io_stream\\Student2.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		
		Student s1=new Student();
		s1.rollno=10;
		s1.name="John";
		s1.dept="CSE";
		s1.avg=75.4f;
		dos.writeInt(s1.rollno);
		dos.writeUTF(s1.name);
		dos.writeUTF(s1.dept);
		dos.writeFloat(s1.avg);
		
		dos.close();
		fos.close();
		
		
		//reading from file
		FileInputStream fis=new FileInputStream("C:\\Users\\Jaya shree\\eclipse-workspace\\Basic_java\\src\\io_stream\\Student2.txt");
		DataInputStream dis=new DataInputStream(fis);
		Student s=new Student();
		s.rollno=dis.readInt();
		s.name=dis.readUTF();
		s.dept=dis.readUTF();
		s.avg=dis.readFloat();
		
		System.out.println("Rollno"+s.rollno);
		System.out.println("Name"+s.name);
		System.out.println("Dept"+s.dept);
		System.out.println("Avg"+s.avg);
		
		dis.close();
		fis.close();

	}

}
