import java.util.Scanner;
class VowelsFromUserName 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.next().toUpperCase();
		int len = name.length();
		
		
		for (int i=0;i<len ;i++)
		{
			switch (name.charAt(i))
			{
			case 'A','E','I','O','U':
			System.out.println(name.charAt(i)+ " is a Vowel");
			
			}

		}
	}
}
