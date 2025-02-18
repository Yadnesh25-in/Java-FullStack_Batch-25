class HollowPattern4
{
	public static void main(String[] args)
	{
		int num = 10;
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if(i==0||j==num-1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}