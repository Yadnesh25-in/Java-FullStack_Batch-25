class HollowPattern5
{
	public static void main(String[] args)
	{
		int num = 10;
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (i+j==num-1||j==num-1)
					System.out.print("* ");
				else
					System.out.print( "  " );
			}
			System.out.println();
		}
		for (int i=1;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
		{
			if(i==j||j==num-1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		}
	}
}