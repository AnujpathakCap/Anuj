package Application;

import java.util.Scanner;

public class AccountUi {
	public static void main(String args[])
	{
Scanner KB=new Scanner(System.in);
		
		//create initial accounts
		System.out.print("How Many Customer U Want to Input : ");
		int n=KB.nextInt();
		Account C[]=new Account[n];
		for(int i=0;i<C.length;i++)
		{   
			C[i]=new Account();
			C[i].accOpenAcc();
		}
		int ch;
		System.out.println("Main Menu\n");
				System.out.println("1.Display All\n");
				
				System.out.println("2.Search By Account\n");
				System.out.println("3.Deposit\n");
				System.out.println("4.Withdrawal\n");
				System.out.println("5.Exit");
			
				
				System.out.println("Ur Choice :");
				ch=KB.nextInt();
				switch(ch)
				{ 
					case 1:
						for(int i=0;i<C.length;i++)
						{
							C[i].showAccount();
						}
						break;

					case 2:
						System.out.print("Enter Account No U Want to Search...: ");
						String acn=KB.next();
						boolean found=false;
						for(int i=0;i<C.length;i++)
						{  
							found=C[i].search(acn);
							if(found)
							{
								break;
							}
						}
						if(!found)
						{
							System.out.println("Search Failed..Account Not Exist..");
						}
						break;

					case 3:
						System.out.print("Enter Account No : ");
						acn=KB.next();
						found=false;
						for(int i=0;i<C.length;i++)
						{  
							found=C[i].search(acn);
							if(found)
							{
								C[i].depositMoney();
								break;
							}
						}
						if(!found)
						{
							System.out.println("Search Failed..Account Not Exist..");
						}
						break;

					case 4:
						System.out.print("Enter Account No : ");
						acn=KB.next();
						found=false;
						for(int i=0;i<C.length;i++)
						{  
							found=C[i].search(acn);
							if(found)
							{
								C[i].WithdrawMoney();
								break;
							}
						}
						if(!found)
						{
							System.out.println("Search Failed..Account Not Exist..");
						}
						break;

					case 5:
						System.out.println("Good Bye..");
						break;
				}
			
			while(ch!=5);
		}
	}
	


