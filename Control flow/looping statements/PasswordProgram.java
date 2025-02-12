import java.util.Scanner;
class PasswordProgram 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int storedPin = 2523;
		int seconds = 5000;
		int attempts = 3;
		
		outerloop: 
		for (; ; )
		{
			
			
			do
			{
				System.out.println("Enter your pin : ");
				int pin = sc.nextInt();
				
				if (storedPin==pin)
				{
					System.out.println("PHONE UNLOCKED");
					break outerloop;
				}
				else{
					System.out.println("WRONG PIN");
					System.out.println("AATEMPTS LEFT"+(attempts-1));
				}
				attempts--;
			
				}while (attempts>=1);
			
			System.out.println();
			System.out.println("PHONEIS DISABLED FOR "+ (seconds/1000)+"seconds");
			Thread.sleep(seconds);
			seconds *=2;
			
		}
		
	}
}
