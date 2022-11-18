package io_stream;
import java.io.*;
public class ByteArray_CharArray {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		/*byte b[]= {'a','b','c','d','e'};
		
		ByteArrayInputStream bis=new ByteArrayInputStream(b);
		
		String str=new String(bis.readAllBytes());
		
		System.out.println(str);
		
		bis.close();*/
		
		/*ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
		
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		
		bos.writeTo(new FileOutputStream("C:/Users/Jaya shree/eclipse-workspace/Basic_java/src/io_stream/Destination.txt"));
		
		bos.close();*/
		
		char c[]= {'a','b','c','d'};
		
		CharArrayReader cr=new CharArrayReader(c);
		
		int x;
		while((x=cr.read())!=-1) {
			System.out.println((char)x);
		}
		cr.close();

	}

}
