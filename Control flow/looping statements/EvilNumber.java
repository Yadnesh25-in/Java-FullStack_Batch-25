/*
Evil Number
An Evil Number is a number 
that has an even number of 1s in its binary representation.
*/
import java.util.Scanner;
class EvilNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int count=0;
		while(num>0)
		{
			if(num%2==1)
				count++;
			num/=2;
		}
		if(count%2==0)
		{
			 System.out.println(dup+" is an Evil Number");
		}
		else
		{
			System.out.println(dup+" is Not an Evil Number");
		}
		
	}
}