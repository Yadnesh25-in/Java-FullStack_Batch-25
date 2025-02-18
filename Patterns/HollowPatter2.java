class HollowPatter2
{
	public static void main(String[] args)
	{
		int num=10;
		for (int i=0; i<num;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (j==num-1||i+j==num-1||i==num-1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}