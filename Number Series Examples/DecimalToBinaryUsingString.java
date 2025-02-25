import java.util.Scanner;
class NumberToBinaryUsingString
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		String res = "";
		int count=1;
		while(num>0)
		{
			res = (num%2)+res;
			num/=2;
		}
		System.out.println(res);
	}
}