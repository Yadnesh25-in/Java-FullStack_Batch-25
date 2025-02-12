import java.util.Scanner;
class Q60PalindroneString 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		System.out.println("Enter String : ");
		String name = new Scanner(System.in).nextLine();
		int first = 0,last=name.length()-1;
		while(first<last)
		{
			if(name.charAt(first)!=name.charAt(last))
			{
				System.out.println("Not Palindrone ");
				return;
			}
			first++;
			last--;
		}
		if(flag)
			System.out.println("Palindrone ");
	}
}
