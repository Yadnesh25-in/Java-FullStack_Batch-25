import java.util.Scanner;

/*
A Buzz Number is a number that is either:

Divisible by 7, or
Ends with 7
Examples:
49 ? Divisible by 7 ? (Buzz Number)
27 ? Ends with 7 ? (Buzz Number)
35 ? Divisible by 7 ? (Buzz Number)
23 ? Not divisible by 7, doesn't end with 7 ? (Not a Buzz Number)
*/
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		if(num%7==0 || num%10==7)
		{
			System.out.println(num+" Is Buzz Number");
		}
		else
		{
			System.out.println(num+" Is Not A Buzz Number");
		}
	}
}