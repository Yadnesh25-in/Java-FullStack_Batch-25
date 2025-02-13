class NumberSeries		//		 144  2197  196  3375  256
{
	public static void main(String[] args) 
	{
		int nextNum = 0;
		for (int i = 12;i<=18 ;i++ )
		{
			if (i%2==0) 
			{
				nextNum = i*i;
				
			}
			else
				nextNum= i*i*i;
			System.out.println(i+" : "+nextNum);
		}
		
		
	}
}
