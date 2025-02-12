import java.util.Scanner;
class MaxDigitNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int max  =0;
		for (int i = num;i>0 ;i/=10)
		{
			int dgt = i%10;
			if (max<dgt)
			{
				max = dgt;
			}
		}
		System.out.println("Largest Number from "+num+" is : "+max);
		
	}
}
