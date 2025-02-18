class HollowPattern7
{
	public static void main(String[] args)
	{
		int num = 13;
		for (int i=0;i<num ;i++ )
		{
			for (int j=0 ;j<num ;j++ )
			{
				if(j==0||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i=1;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if(i+j==num-1||j==0)
					System.out.print("* ");
				else
					System.out.print("  "); 
			}
			System.out.println();
		}
	}
}