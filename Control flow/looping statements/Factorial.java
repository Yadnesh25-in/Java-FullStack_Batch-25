class Factorial 
{
	public static void main(String[] args) 
	{
		long num = 5;
		long fact = 1; 
		
		for (long i = num;i>=1 ;i-- )
		{
			fact*=i;
		}
		System.out.println(fact);
	}
}
