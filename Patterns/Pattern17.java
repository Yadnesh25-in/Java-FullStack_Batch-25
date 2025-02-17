import java.util.Scanner;
class Pattern17
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
				if (j<i)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			for (int j=1;j<num ;j++ )
			{
				if (j<num-i)
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}