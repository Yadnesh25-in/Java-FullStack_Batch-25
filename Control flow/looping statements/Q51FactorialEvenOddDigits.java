import java.util.Scanner;
class Q51FactorialEvenOddDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter Number : ");
		int num = new Scanner(System.in).nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		int sum = 0;
		while(num>0)
		{
			int rem =num%10;
			num/=10;
			int fact = 1;
			if(rem%2==0)
			{
				for(int i=1;i<=rem;i++)
				{
					fact*=i;
				}
				sumEven+=fact;
			}
			if(rem%2!=0)
			{
				for(int j=1;j<=rem;j++)
				{
					fact*=j;
				}
				sumOdd+=fact;
			}
			sum+=fact;
			System.out.println("Factorial Of "+rem+" Is "+fact);
		}
		System.out.println("Sum Of Factorials : "+sum);
		System.out.println("Sum Of Even Factorials : "+sumEven);
		System.out.println("Sum Of Odd Factorials : "+sumOdd);


	}
}
 