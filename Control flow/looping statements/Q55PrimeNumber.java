import java.util.Scanner;
class Q55PrimeNumber
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		int count = 0 ;
		for(int i=2;i<(num/2);i++)
		{
			if(num%i==0)
			{
				count++;
			}
				
		}
		System.out.print(count==0?num+" Is Prime":num+" Is Not Prime");
	}
}
