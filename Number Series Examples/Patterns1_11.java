class Patterns1_11 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i<6;i++)
		{
			for(int j = 1 ; j<5 ;j++)
			{
				if(j>6-i)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			for(int j = 1 ; j<6 ;j++)
			{
				if(j>=i || i==5 && j==1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*  ");
				}
			}
			System.out.println();
		}
		for(int i = 2 ; i<6;i++)
		{
			for(int j = 1 ; j<6 ;j++)
			{
				if(j<=i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j = 1 ; j<5 ;j++)
			{
				if(5-i>j)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}