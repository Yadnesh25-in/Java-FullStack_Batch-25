import java.util.Scanner;

/*
A Spy Number is a number where the sum of its digits is equal to the product of its digits.
Example:
112 
Sum = 1 + 1 + 2 = 4
Product = 1 � 1 � 2 = 4 ? (Spy Number)
123
Sum = 1 + 2 + 3 = 6
Product = 1 � 2 � 3 = 6 ? (Spy Number)
125
Sum = 1 + 2 + 5 = 8
Product = 1 � 2 � 5 = 10 ? (Not a Spy Number)
*/

class SpyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int product = 1 , sum = 0 ,temp = num;
		while(num>0)
		{
			product*=num%10;
			sum+=num%10;
			num/=10;
		}
		if(product==sum)
			System.out.println(temp+" Is Spy Number ");
		else
			System.out.println(temp+" Is Not Spy Number ");
	}
}