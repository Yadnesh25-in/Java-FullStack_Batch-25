import java.util.Scanner;
class CharectersFromUserName 
{
	public static void main(String[] args) 
	throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.next().toUpperCase();
		int l = name.length();
		
		
		for (int i=0;i<l ;i++ )
		{
			System.out.println(name.charAt(i));
			Thread.sleep(1500);
			
		}
		
		
		
		
	}
}
