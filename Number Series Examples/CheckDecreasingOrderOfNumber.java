import java.util.Scanner;
class CheckDecreasingOrderOfNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int flag = 1 ;
		while(num>=10)
		{
			
				if((num%10)>((num/10)%10))
				{
					flag=0;
					break;
				}			
			num/=10;
		}
		if(flag==0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}

	}
}