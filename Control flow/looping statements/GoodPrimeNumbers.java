import java.util.Scanner;
class GoodPrimeNumbers
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int count = 0;
		for(int i=2;i<=num;i++) 
		{
			if(i<2)
				continue;
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
				int temp = i;
				System.out.println("prime : "+temp);
				flag = true;
				label:
				while(temp>0)
				{
					flag=true;
					int rem = temp%10;
					if(rem==1)
					{
						flag=false;
						break label;
					}
					for(int j = 2 ; j<rem ; j++)
					{
						if(rem%j==0)
						{
							flag = false;
							break label;
						}
					}
					temp/=10;
				}
				if(flag)
				{
					count++;		
				}
			}
		}
		System.out.println("Good Prime Count : "+count);
	}
}