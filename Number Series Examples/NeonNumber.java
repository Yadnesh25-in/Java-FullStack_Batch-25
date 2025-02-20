import java.util.Scanner;

/*
A Neon Number is a number whose sum of the digits of its square is equal to the number itself.

Example:
9� = 81 ? 8 + 1 = 9 ? (Neon Number)
12� = 144 ? 1 + 4 + 4 = 9 ? (Not a Neon Number)
*/
class Q130NeonNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int n = new Scanner(System.in).nextInt();
		int sqrt = n*n ;
		int sum = 0;
		while(sqrt>0)
		{
			sum += sqrt%10;
			sqrt/=10;
		}
		if(sum==n)//square of number ex 9 is 81 and their sum is 9 == 9 
			System.out.println("Neon Number :"+n);
		else
			System.out.println("Not Neon Number : "+n);
	}
}