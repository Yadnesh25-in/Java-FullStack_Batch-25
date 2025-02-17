import java.util.Scanner;
class Pattern11
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
				if (i==0||j==0||i==num-1||j==num-1||i==num/4&&j<num/4||i==num/4&&j>num*3/4||i==num*3/4&&j<num/4||i==num*3/4&&j>num*3/4||j==num/4&&i<num/4||j==num/4&&i>num*3/4||j==num*3/4&&i<num/4||j==num*3/4&&i>num*3/4||j==i&&j>num/4-1||j==i&&i>num*3/4||i+j==num-1&&j>num/4)
				{
					System.out.print("*" + " " );
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}