import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String Username1= null;
		String password1 = null;
		String address = null;
		long contact = 0;
		double balance = 0;
		
		for (; ; )
		{
		
			System.out.println();
			System.out.println("		WELCOME			");
			System.out.println();
			System.out.println("		LAXMI CHEAT FUND		");
			System.out.println(" CHOOSE YOUR OPTION " );
			System.out.println("1. LOGIN");
			System.out.println("2.CREATE A NEW ACCOUNT");
			System.out.println();
			int opt = sc.nextInt();
			System.out.println();
		
		   
		
		if (opt==1)
		{
			if (username1==null)
			{
				System.out.println("CREATE YOUR ACCOUNT FIRST : ");
				continue;
			}
			
			System.out.println("LOGIN");
			System.out.println();
			
			
			for (int i =3;i.>=1 ;i-- )
			{
				System.out.println();
				System.out.println("Username : ");
				String username = sc.next();
				System.out.println();
				System.out.println("Password : ");
				String password = sc.next();
				
				if (username.equals(username1)&& password.equals(password1))
				{
					home:
					for (; ; )
					{
						System.out.println();
						System.out.println("	HOME PAGE	 ");
						System.out.println();
						System.out.println("1.DEPOSTE");
						System.out.println("2.WITHDRAW");
						System.out.println("3.CHECK BALANCE");
						System.out.println("4.MINI STATEMENT");
						System.out.println("5.LOGOUT");
						System.out.println();
						System.out.println("ENTER YOUR OPTION : ");
						int opt1 = sc.nectInt();
						System.out.println();
						
						switch (opt1)
						{
						case 1 :{
							System.out.println("DEPOSITE");
							System.out.println();
							System.out.println("ENTER THE AMOUNT : ");
							double depositeAmt = sc.nextDouble();
							System.out.println("AMOUNT DEPOSITE SUCCESSFULLY!");
							System.out.println();
							break;
						}
						case 2 :{
							System.out.println("WITHDRAW");
							System.out.println();
							System.out.println("ENTER THE AMOUNT : ");
							double withdreaw = sc.nextDouble();
							System.out.println("ENTER YOUR PIN : ");
							String password3 = sc.next();
							
							if (password3.equals())
							{
							}
						}
						
						}
					}
				}
				
			}
			
		}
		else if (opt ==2)
		{
			System.out.println(" ENTER YOUR NAME : ");
			String name = sc.next();
			System.out.println();
			System.out.println("Enter Your Mobile Number: ");
			long mblNumber = sc.nextLong();
			System.out.println("ENTER YOUR ADDRESS: ");
			String address = sc.next();
			System.out.println();
			System.out.println("ENTER A AMOUNT TO DEPOSTE: ");
			long depostiteAmount = sc.nextLong();
		}	
		}	
		}
		
}

