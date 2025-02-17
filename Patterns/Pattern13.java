import java.util.Scanner;
class Pattern13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (j<num-i-1)
			{
				System.out.print("  ");
			}
			else
			{
				System.out.print(" *");
			}
			}
			System.out.println();
		}
	}
}