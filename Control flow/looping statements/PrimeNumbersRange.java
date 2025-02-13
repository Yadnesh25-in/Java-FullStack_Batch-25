import java.util.Scanner;
class PrimeNumbersRange
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Range : ");
		int num = new Scanner(System.in).nextInt();
		int count = 0;
		for(int i=2;i<=num;i++) 
		{
			
			boolean flag = true;
			for(int j=2 ; j<i ; j++)
			{
				if(i%j==0)
				{
					flag=false;
					continue;
				}
			}
			if(flag)
			{
				System.out.print(i+" ");
			}		
		}
	}
}