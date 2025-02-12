import java.util.Scanner;
class Q57ReverseNumLeetCode
{
	public static void main(String[] args) 
	{
		System.out.println("\nEnter Number : ");
		long num = new Scanner(System.in).nextInt();
		long temp = num ;
		long rev =0 , rem ;
		if(num<0)
			num=-num;
		while(num>0)
		{
			rem=num%10;
			rev =(rev*10)+rem;
			num=num/10;
		}
		if(temp<0)
		{
			rev=-rev;	
		}
		if(rev>Integer.MAX_VALUE)
		{
			rev=0;
		}
		System.out.println(temp+" "+rev);
	}
}
