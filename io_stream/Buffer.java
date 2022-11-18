package io_stream;
import java.io.*;
public class Buffer {
	public static void main(String[]args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\Jaya shree\\eclipse-workspace\\Basic_java\\src\\io_stream\\Test.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.mark(10);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.reset();
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		
		
	}

}
