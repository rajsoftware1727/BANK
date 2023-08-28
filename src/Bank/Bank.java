package Bank;
import java.util.*;
class AccountCreate
{
	private String CustomerName;
	private String CustomerAddress;
	private long mobileNo;
	final int AccountNo;
	private int i=100;
	private int j=1;
	AccountCreate()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Hai Buddy please Enter Your Name");
		this.CustomerName=reader.next();
		System.out.println("Buddy Enter Your Address ");
		this.CustomerAddress=reader.next();
		System.out.println("Hai Buddy Enter Your CellNo");
		this.mobileNo=reader.nextLong();
		
		AccountNo=100;
		System.out.println("Hai Buddy Your Account is Successfully Created");
		System.out.println("This is Your New SBI ACCOUNT NO : "+AccountNo);
		
	}
	public String getcustomerName()
	{
		return this.CustomerName;
	}
	
	
}
class ATM
{
	
}
class Welcome
{
	static void Welcome1()
	{
		Scanner reader=new Scanner(System.in);
	System.out.println("WELCOME TO SBI BANK");
	System.out.println("Please Enter 0 for AC OR 1 for exit "); 
	int option=reader.nextInt();
	if(option==0)
	{
		System.out.println("Welcome to Account Create Page");
	}
	else
	{
		System.out.println("Thank you for Visiting");
	}
    }
	
}

public class Bank {
public static void main(String args[])
{
	
    Welcome.Welcome1();
    AccountCreate A1=new AccountCreate();
	 
 	
}
}

