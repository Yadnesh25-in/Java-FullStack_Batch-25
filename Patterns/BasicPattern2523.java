import java.util.Scanner;
class Pattern23
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		for (int i=0;i<=num ;i++ )
		{
			int inc = 1;
			for (int j=0;j<num ;j++ )
			{
				int cnt= i+inc;
				if (j<=i)
				{
					System.out.print(cnt+" ");
					cnt--;
					inc++;
				}
			}
			System.out.println();
		}
	}
}