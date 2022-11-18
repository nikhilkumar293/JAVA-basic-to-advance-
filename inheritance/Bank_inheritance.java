package inheritance;
import java.util.*;
class Account{
	long accno;
	int balance;
	String address;
	String phn;
	String DOB;

	
	public Account(long accno,int balance,String address,String phn,String DOB) {
		this.accno=accno;
		this.balance=balance;
		this.address=address;
		this.phn=phn;
		this.DOB=DOB;
	}
	
	public long getacc() {
		return accno;
	}
	public String setadd(String address) {
		this.address=address;
		return this.address;
	}
	public int setbal(int balance) {
		this.balance=balance;
		return this.balance;
	}
	public String setPhn(String phn) {
		this.phn=phn;
		return this.phn;
	}
	public String setDOB() {
		return DOB;
	}
	public void details()
	{ 
		System.out.println(accno);
		System.out.println(balance);
		System.out.println(address);
		System.out.println(phn);
		System.out.println(DOB);
		
	}
	
}

class Savingaccount extends Account{
 int bal;
	public Savingaccount(long accno, int balance, String address, String phn, String DOB) {
		super(accno, balance, address, phn, DOB);
		// TODO Auto-generated constructor stub
		bal=balance;
	}
	public int deposit(int deposit) {
		bal=setbal(bal)+deposit;
		setbal(bal);
		return bal; 
	}
	
   
	
}

public class Bank_inheritance {
	public static void main(String[]args) {
	 Savingaccount a=new Savingaccount(12345678,100000,"vadodara","9679561176","24/09/2001");
	 a.deposit(1000);
	 a.details();
	}
}
