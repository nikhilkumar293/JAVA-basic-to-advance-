package io_stream;
import java.io.*;
public class File_handling {
	public static void main(String[]args) {
		File f=new File("C:\\Users\\Jaya shree\\eclipse-workspace\\Basic_java\\src\\io_stream");
		System.out.println(f.isDirectory());
		File list[]=f.listFiles();
		
		for(File x:list) {
			System.out.println(x.getParent()+" "+x.getName());
		}
	}

}
