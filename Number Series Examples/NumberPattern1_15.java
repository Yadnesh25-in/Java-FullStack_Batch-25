class NumberPattern1_15
{
	public static void main(String[] args) 
	{
		int n = 0;
		for(int i = 1; i<=5 ;i++)
		{
			n=n+i;
			int b = n;
			for(int j = 1 ; j<=5 ; j++)
			{
				if(j<=i)
				{
					
					System.out.print(n--+" ");
				}
			}
			n=b;
			
			System.out.println();
		}
	}
}
/*
1
3 2
6 5 4
10 9 8 7
15 14 13 12 11
*/