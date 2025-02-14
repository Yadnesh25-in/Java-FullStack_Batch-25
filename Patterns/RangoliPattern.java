import java.util.Scanner;
class RangoliPattern 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a length : ");
		int n = new Scanner(System.in).nextInt();
		
		for (int i = 0;i<n;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
				
				if (j ==n/4 || i==n/4 || i==3*n/4 || j==3*n/4 || i == n/8 && j==n/8 || j==n-1&&i<=n/4)
					System.out.print("*"+" ");
				
				else
					System.out.print(" "+" ");
			}
			
			System.out.println();
		}
		
		}
}
