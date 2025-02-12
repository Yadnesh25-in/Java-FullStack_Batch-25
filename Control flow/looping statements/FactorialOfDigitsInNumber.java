import java.util.Scanner;
class FactorialOfDigitsInNumber 
{
	public static void main(String[] args) 
	{
		
		int num = 12345;
		int dup = num;
		int sum = 0;
		
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			if (rem%2!=0)
			{
				for (int i = rem ; i>=1 ;i-- )
				{
					fact*=i;
					
				}
				sum+=fact;
			}
			
			
			num/=10;
		}
		System.out.println(dup);
		System.out.println("Sum of the even of digits factorial : "+ sum);
		
	}
}
