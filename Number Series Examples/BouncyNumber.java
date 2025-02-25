import java.util.Scanner;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int flag1 = 1 ,flag2 = 1,temp = num;
		while(num>=10)
		{
				if((num%10)<((num/10)%10))
				{
					flag1=0;
				}	
				if((num%10)>((num/10)%10))
				{
					flag2=0;
				}		
			num/=10;
		}
		if(flag1==1 || flag2==1)
		{
			System.out.println("Not An Bouncy");
		}
		else
		{
			System.out.println("Bouncy");
		}
	}
}