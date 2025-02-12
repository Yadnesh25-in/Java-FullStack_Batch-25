import java.util.Scanner;
class MinDigitNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int min =9;
		for (int i = num;i>0 ;i/=10)
		{
			int dgt = i%10;
			if (min>dgt)
			{
				min = dgt;
			}
		}
		System.out.println("Smallest Number from "+num+" is : "+min);
		
	}
}
