import java.util.Scanner;
class Q59ReverseStringLeetCode 
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
		rev = "";
		for(int i = 0 ;i<name.length();i++)
		{
			rev = name.charAt(i)+rev;
		}
		System.out.println(rev);
		StringBuffer reverse = new StringBuffer(System.in);

	}
}
