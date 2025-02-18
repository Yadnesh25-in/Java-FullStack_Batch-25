class Pattern9
{
	public static void main(String[] args)
	{
		int n=5;char c= 'a';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==3||i==5)
					System.out.print(c++ +" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}