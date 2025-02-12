import java.util.Scanner;
class Q50FactorialSumOfDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter Number : ");
		int num = new Scanner(System.in).nextInt();
	
		int sum = 0;
		
		while(num>0)
		{
			int fact = 1;
			int rem = num%10;
			for(int i = 1; i<=rem;i++)
			{
				fact *=i;
			}
			num/=10;
			sum+=fact;
			System.out.println("Factorial Of "+rem+" Is "+fact);
		}
		System.out.println("Sum Of Factorials : "+sum);
	}
}
 