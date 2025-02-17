import java.util.Scanner;
class Q93PatternHomework2 
{
	public static void main(String[] args) 
	{
		int n = new Scanner(System.in).nextInt();
		int diff,value;
		for(int i = 1; i <=n ; i++)
		{
			diff = n-1;
			value = i;
			for(int j = 1; j<=i ; j++)
			{
				System.out.print(value+" ");
				value += diff;
				diff--; 
			}
			System.out.println();
		}
	}
}