import java.util.Scanner;
class Q58ReverseStringLeetCode 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String : ");
		String name = new Scanner(System.in).next();
		String rev ="" ;
		for(int i = name.length()-1;i>=0;i--)
		{
			rev += name.charAt(i);
		}
		System.out.println(rev);
	}
}
