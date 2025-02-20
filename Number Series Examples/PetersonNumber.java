import java.util.Scanner;
/*
A Peterson Number is a number where the sum of the factorial of its digits is equal to the number itself.  
Example:  
1. 145  
   - (1! + 4! + 5!)  
   - (1 + 24 + 120 = 145) ? (Peterson Number)  

2. 125 
   - (1! + 2! + 5!)  
   - (1 + 2 + 120 = 123) ? (Not a Peterson Number)  

*/
class PetersonNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int temp = num;
		int fact = 1;
		int result = 0;
		while(temp>0)
		{
			fact = 1;
			for(int i = 1 ; i<=(temp%10);i++)
				fact*=i;
			result+=fact;
			temp/=10;
		}
		if(num==result)
			System.out.println("Peterson Number : "+result);
		else
			System.out.println("Not An Peterson Number ");
	}
}