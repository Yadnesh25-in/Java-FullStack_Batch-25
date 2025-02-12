import java.util.Scanner;
class Q58PalindroneNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("\nEnter A Number : ");
		int num = new Scanner(System.in).nextInt();
		int temp = num ; 
		int rev = 0;
		while(temp>0)
		{
			rev = (rev*10)+temp%10;
			temp/=10;
		}
		if(rev==num)
		{
			System.out.println("Palindrone");
		}
		else
		{
			System.out.println("Not Palindrone");

		}
	}
}
