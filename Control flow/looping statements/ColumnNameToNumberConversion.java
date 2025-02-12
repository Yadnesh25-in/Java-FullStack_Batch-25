import java.util.Scanner;
class ColumnNameToNumberConversion
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter some Charecters : ");
		String str = sc.next().toUpperCase();
		
		int num = 0;
		
		for (int i=0 ;i<str.length() ;i++ )
		{
			char ch = str.charAt(i);
			num = num*26+(ch - 1);
			
		}
		System.out.println("Number Value is : "+num);
		
		
	}
}
