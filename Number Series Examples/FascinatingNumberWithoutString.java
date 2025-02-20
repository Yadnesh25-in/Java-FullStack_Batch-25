import java.util.Scanner;
class FascinatingNumberWithoutUsingString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = true;
		int temp=num;
		for (int i=2;i<=3 ;i++ )
		{
			num*=1000;
			num+=temp*i;
		}
		for (int i=1;i<=9 ;i++ )
		{
			int cnt=0;
			for (int j=num;j>0 ;j/=10 )
			{
				int rem = j%10;
				if (rem==i)
				{
					cnt++;
				}
			}
			if (cnt!=1)
			{
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("The given number is a Fascinating number.");
		else
			System.out.println("The given numebr is not Fascinating numebr.");
	}
}