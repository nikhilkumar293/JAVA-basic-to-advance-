package exception;
import java.util.*;
public class ExceptionDemo {
    public static void main(String[]args) {
    	int a=10,b=0,c;
    	int d[]= {10,0,1,3,5};
    try {
    		try {
        	c=a/b;
    	    System.out.println("End");
    		
    	  }
    	catch(ArithmeticException e) {
        	System.out.println("Error"+" "+e);
        }
    		System.out.println(d[10]); 
    }
    
    catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("Error"+" "+e);
    }
    
    }
	
}
