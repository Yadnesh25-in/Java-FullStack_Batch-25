import java.util.Scanner;
class EmirpNumber 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int rev = 0  ,reverse = num;
		for(int i = 2; i<(num/2); i++)
		{
			if(num%i==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			while(num>0)
			{
				rev = rev*10+(num%10);
				num/=10;
			}
			for(int i = 2; i<(rev/2); i++)
			{	
				if(rev%i==0)
				{
					flag = true;
					break;
				}
			}
		}
		if(!flag)
				System.out.println(reverse+" Is  A Emirp Number.");
			else
				System.out.println(reverse+" Is Not A Emirp Number.");
	}
}