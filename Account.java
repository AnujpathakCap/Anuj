package Application;

import java.util.Scanner;

public class Account {
private long accno;
private String name;
private long balance;
Scanner s=new Scanner(System.in);
public void createAcc(){
	String adhaar;
	int phnNum;
	 String panNum;
	System.out.println("Name: ");
	name=s.nextLine();
	System.out.println(" Adhaar Card Numnber:");
	adhaar=s.nextLine();
	System.out.println("phone Number:");
	phnNum=s.nextInt();
	System.out.println("Pan Card:");
	panNum=s.nextLine();
	System.out.println("Successfully account created");
	
}
void accOpenAcc()
{
	Long phnNum;
	System.out.println("Enter the Mobile number");
    phnNum=s.nextLong();
    System.out.println("Enter the name");
	name=s.next();
	
	System.out.println("Enter the balance");
	balance=s.nextLong();
	accno= phnNum - 12;
	System.out.println("Account number is "+accno );
	}
public void showAccount()
{
	System.out.println("Account number is:" +accno+ "Name of" +name+ "have balance " +balance);
}

	 public void depositMoney() {

	       long amount ;
	        Scanner scn = new Scanner(System.in);
	        System.out.println("please enter the deposit amount");
	         amount = scn.nextLong();
	        balance += amount ;
	        System.out.println("your currentbalance="+balance);

	      
	    }

	 public void WithdrawMoney() {


	        double amount;
	        

	        /*double Currentbalanace = despositMoney();*/

	        //setDaily Withdrawl limit
	           final double setDailyLimit = 2500.00;     

	            Scanner withDraw = new Scanner(System.in);
	            System.out.println("please enter the withdraw amount");
	             amount =withDraw.nextDouble();


	        if(balance < amount)
	            System.out.println("you have less amount : your current balance is="+balance);

	        else if (amount > setDailyLimit)
	            System.out.println("you have entered amount exceed than daily limit : your dailyLimit="+setDailyLimit);

	        else 
	            balance -= amount;
	            System.out.println("your current balance is="+balance);

	    }

	boolean search(String acn)
	{ 
		if(accno.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
	
}

