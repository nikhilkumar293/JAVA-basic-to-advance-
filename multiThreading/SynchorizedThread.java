package multiThreading;
class display extends Thread{

	synchronized void disp(String data) {
		for(int i=0;i<data.length();i++) {
			System.out.println(data.charAt(i));
		}
	}
}
class first extends Thread{
	display d;
	public first(display mydata) {
		// TODO Auto-generated constructor stub
		d=mydata;
	}
	
	public void run() {
		d.disp("My Name is");
	}
}

class second extends Thread{
	display d;
	public second(display mydata) {
		this.d=mydata;
	}
	public void run() {
		d.disp("Nikhil Kumar");
	}
}
public class SynchorizedThread {
	public static void main(String[]args) {
		 display mydata=new display();
		  first f=new first(mydata);
		  second s=new second(mydata);
		  f.start();
		  
		  s.start();
	}
 
}
