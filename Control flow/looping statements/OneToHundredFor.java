class OneToHundredFor 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(i);
		}
		
		for (char ch = 'A';ch<='Z' ;ch++ )
		{
			System.out.print(ch+" ");
			
		}
		System.out.println();
		
		for (char ch='z';ch>='a' ;ch-- )
		{
			System.out.print(ch+ " ");
		}
		System.out.println();
		for (char a ='0'; a<='9'; a++)
		{
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println();
		
		for (char a =0; a<=127; a++)
		{
			System.out.println  (("  "+(int)a)+":"+a );
		}

	}
}
