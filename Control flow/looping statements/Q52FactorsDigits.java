import java.util.Scanner;
class Q52FactorsDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter Number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.printl("Factors : ");
		for(int i = 2 ; i<num ; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
