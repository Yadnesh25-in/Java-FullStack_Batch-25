import java.util.Scanner;
class SwastikPattern 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a length : ");
		int n = new Scanner(System.in).nextInt();
		
		for (int i = 0;i<=n ;i++ )
		{
			for (int j = 0;j<=n ;j++ )
			{
				
				if (j==n/2 ||i==n/2 || i == 0&& j >n/2 || j ==0 && i<n/2 || i == n && j<n/2 || j == n && i>n/2||i==j||i+j==n || i==0 && j <= 0.25*n) 
				{
				
					System.out.print("*"+" ");
				}
					
				else
					System.out.print(" "+" ");
			}
			
			System.out.println();
		}
		
		}
}
