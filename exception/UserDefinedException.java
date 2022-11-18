package exception;
import java.util.*;
class stackoverflow extends Exception{
	public String toString(){
	return "Stack is full";
	}
}
class stackunderflow extends Exception{
	public String toString(){
	return "Stack is empty";
	}
}
public class UserDefinedException {
	static Scanner sc=new Scanner(System.in);
	static int s=3;
	static int stack[]=new int[s];
	static int top=-1;
	public static void main(String[]args) {
		int n=0;
		do {
		System.out.println("Enter the operation 1.push or 2.pop or 3.display");
		int p=sc.nextInt();
		switch(p) {
		case 1:push();
		break;
		case 2:pop();
		break;
		case 3:display();
		break;
		}
		}while(n==0);
	}

	private static void push() {
		// TODO Auto-generated method stub
		if(top==s-1) {
			try {
				throw new stackoverflow();
			}
			catch(stackoverflow e) {
				System.out.println(e);
				
			}
		}
		else {
		++top;
		System.out.println("Enter the element");
		int push=sc.nextInt();
		stack[top]=push;
		}
		
	}

	private static void pop() {
		// TODO Auto-generated method stub
		if(top==-1) {
			try {
				throw new stackunderflow();
			}
			catch(stackunderflow e) {
				System.out.println(e);
			}
		}
		else
		top--;
		
	}
	
	private static void display() {
		for(int i=top;i>=0;i--)
		{
			System.out.print(stack[i]+" ");
			System.out.println();
		}
	}
}
 