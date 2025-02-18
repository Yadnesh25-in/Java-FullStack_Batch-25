class BasicPattern9
{
	public static void main(String[] args) 
	{
		int num = 1;
		char ch  = 'a';
		for (int i = 1;i<=5 ;i++ )
		{
			for (int j = 1 ;j<=i ;j++ )
			{
				if ((i+j)%2==0)
				{
					System.out.print(ch++ + " ");
				}
				else
					System.out.print(num++ + " ");
				
				
			}
			System.out.println();	
		}
		
	}
}

