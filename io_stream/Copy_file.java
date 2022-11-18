package io_stream;
import java.io.*;
public class Copy_file {
	public static void main(String args[]) {
		try(FileInputStream fis1=new FileInputStream("C:/Users/Jaya shree/eclipse-workspace/Basic_java/src/io_stream/Source1.txt");){
			
			try(FileInputStream fis2=new FileInputStream("C:/Users/Jaya shree/eclipse-workspace/Basic_java/src/io_stream/Source2.txt");){
				
				try(FileOutputStream fos=new FileOutputStream("C:/Users/Jaya shree/eclipse-workspace/Basic_java/src/io_stream/Destination.txt");){
					
				try(SequenceInputStream sis=new SequenceInputStream(fis1,fis2);){
					int b;
					while((b=sis.read())!=-1) {
						fos.write(b);
					}
					sis.close();
					fis1.close();
					fis2.close();
					fos.close();
				
			}
			
		}
	}
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
