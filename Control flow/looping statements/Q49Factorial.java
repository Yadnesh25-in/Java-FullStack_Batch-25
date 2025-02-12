import java.util.Scanner;
class Q49Factorial
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter Number : ");
		int num = new Scanner(System.in).nextInt();
		int fact1 = 1 , fact2 = 1 ;
		for(int i =1 ; i<=num ; i++)
		{
			fact1*=i;
		}
		for(int i = num ; i>=1 ; i--)
		{
			fact2*=i;
		}
		System.out.println(num+" Factorial Is : "+fact1);
	}
}
