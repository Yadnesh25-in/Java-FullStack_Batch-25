import java.util.Scanner;
class KeithNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int n = new Scanner(System.in).nextInt();
		
		int a = 7 , b = 4 , c = 2 ,flag=0;
		int sum = 0;
		while(sum<=n)
		{
			sum = a + b + c ;
			a = b ;
			b = c ;
			c = sum ;
			if(sum==n)
			{
				flag=1;
				break;
			}
		}
		System.out.println((flag==1)?("Keith Number : "+n):("Not A Keith Number : "+n));

	}
}
