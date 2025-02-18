class BasicPattern2 
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		for (int i = 1;i<=5 ;i++ )
		{
			for (int j = 1 ;j<=i ;j++ )
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();	
		}
		
	}
}


/*
a
b	c
d	e	f
g	h	i	j	
*/