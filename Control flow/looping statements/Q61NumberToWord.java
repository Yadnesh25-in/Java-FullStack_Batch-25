import java.util.Scanner;
class Q61NumberToWord
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		String chars =""; 
		int rem ;
		while(num>0)
		{
			rem = num %10;
			switch(rem)
			{
				case 1:
					chars="One "+chars;
					break;
				case 2:
					chars="Two "+chars;
					break;
				case 3:
					chars="Three "+chars;
					break;
				case 4:
					chars="Four "+chars;
					break;
				case 5:
					chars="Five "+chars;
					break;
				case 6:
					chars="Six "+chars;
					break;
				case 7:
					chars="Seven "+chars;
					break;
				case 8:
					chars="Eight "+chars;
					break;
				case 9:
					chars="Nine "+chars;
					break;
				case 0:
					chars="Zero "+chars;
					break;
			}
			num/=10;
		}
		System.out.println(chars);
	}
}
