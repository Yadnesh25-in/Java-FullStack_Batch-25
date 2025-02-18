class HollloPattern6
{
	public static void main(String[] args)
	{
		int num = 10;
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (i+j==num-1||i==num-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int j=1;j<num;j++ )
			{
				if(i==j||i==num-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}