import java.util.Scanner;
class DecimalToBinaryWithoutUsingString
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int res = 0 ,count=1;
		while(num>0)
		{
			res += (num%2)*count;
			count*=10;
			num/=2;
		}
		System.out.println(res);
	}
}