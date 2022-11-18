package inheritance;

import java.util.*;
class My extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
	}
		}
}

class Myrunnable implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++) {
		System.out.println("world");
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	}
}
public class Thread_Runnable_sleep_interrupt {
	public static void main(String []args) {
		My m1=new My();
		m1.start();
		Myrunnable m2=new Myrunnable();
		Thread t=new Thread(m2);
		t.start();
		t.interrupt();
	}

}
