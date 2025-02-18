class RevercePyramid
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");

			for(int j =1;j<=i;j++)
				System.out.print("* ");

			for(int j=1;j<i;j++)    //Here i use less than in place of less than equal
				System.out.print("* ");
			System.out.println();
		}
	}
}

/*
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

*/