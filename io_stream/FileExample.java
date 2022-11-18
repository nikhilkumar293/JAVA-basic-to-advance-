package io_stream;
import java.io.*;
public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos=new FileOutputStream("C:/Users/Jaya shree/eclipse-workspace/Basic_java/src/io_stream/Test.txt");)
				{
					String str="Learn Java Programming";
					
					byte b[]=str.getBytes();
					
					//fos.write(str.getBytes());
					/*for(byte x:b)
						fos.write(x);*/
					fos.write(b,6,str.length()-6);
					
					fos.close();
				}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
