package io_stream;
import java.io.*;
public class RandomAcess {
	public static void main(String [] args) throws Exception{
		RandomAccessFile rf=new RandomAccessFile("C:\\Users\\Jaya shree\\eclipse-workspace\\Basic_java\\src\\io_stream\\Source1.txt","rw");
		
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		rf.write('d');
		
		System.out.println((char)rf.read());
		rf.skipBytes(3);
		System.out.println((char)rf.read());
		rf.seek(3);
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		rf.seek(rf.getFilePointer()+2);
		System.out.println((char)rf.read());
	}

}
