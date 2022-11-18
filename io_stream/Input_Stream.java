package io_stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Input_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream("C:/Users/Jaya shree/eclipse-workspace/Basic_java/src/io_stream/Test.txt");)
				{
					/*byte b[]=new byte[fis.available()];
					
					fis.read(b);
					
					String s=new String(b);
					System.out.println(s);*/
			        
			   int x;
			   
			   do
			   {
				   x=fis.read();
				   if(x!=-1)
				   System.out.print((char)x);
			   }while(x!=-1);
			   
			   while((x=fis.read())!=-1) {
				   System.out.print((char)x);
			   }
			
			
				}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
