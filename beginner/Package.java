package beginner;
import java.util.*;
import beginner.Factorial;
public class Package {
	void computer_method() {
	      System.out.println("Power gone! Shut down your PC soon...");
	   }
	  public static void main(String []args) {
	    Package p =new Package();  p.computer_method();
	    Factorial f=new Factorial();
	    f.main(args);
	  }
	}

