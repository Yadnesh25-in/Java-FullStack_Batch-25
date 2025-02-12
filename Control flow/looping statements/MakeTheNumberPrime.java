import java.util.Scanner;
class  MakeTheNumberPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		boolean flag = true;
		
		for (int i = 2;i<num ;i++ )
		{
			if (num%i==0)
			{
				flag = false;
				num++;
				i=2;
			}
		}
		System.out.println("The Next Prime number after "+dup+ " is : "+ num);
		
			
			
		
	}
}
