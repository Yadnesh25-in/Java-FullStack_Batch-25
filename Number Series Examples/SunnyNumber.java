//  A number n is a sunny number if n + 1 is a perfect square. 
// For example, 8 is a sunny number because 8 + 1 = 9, and 9 is a perfect square (3 * 3). 
// Similarly, 15 is a sunny number because 15 + 1 = 16, and 16 is a perfect square (4 * 4)

import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		num++;
		int sqrt = 0,flag=0;
		for(int i = 1 ; i <= (num/2) ; i++)
		{
			if((i*i)>num)
				break;
			if((i*i)==num)
			{
				sqrt = i ;
				flag=1;
				break;
			}
		}
		System.out.println((flag==1)?("Sunny Number : "+(--num)):("Not A Sunny Number"));
	}
}