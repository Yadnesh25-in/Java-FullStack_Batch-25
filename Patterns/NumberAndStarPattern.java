class NumberAndStarPattern    
{
	public static void main(String[] args) 
	{
		for (int i = 5;i>=1 ;i-- )
		{
			for (int k =1;k<=2 ;k++ )
			{
				int a = i;
				for (int j =1 ;j<=i ;j++ )
				{
					System.out.print(a-- +"*");
				}
			}
			System.out.println();
		}
		
	}
}
