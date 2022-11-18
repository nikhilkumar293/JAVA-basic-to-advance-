package multiThreading;

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
		setPriority(Thread.MAX_PRIORITY);
	}
}

public class Constuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread("my name");
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.start();
		System.out.println(t.getState());
		System.out.println(t.isAlive());
		
		

	}

}
