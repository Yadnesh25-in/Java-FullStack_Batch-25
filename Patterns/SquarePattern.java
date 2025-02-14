import java.util.Scanner;
class SquarePattern 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a length : ");
		int n = new Scanner(System.in).nextInt();
		
		for (int i = 0;i<=n ;i++ )
		{
			for (int j = 0;j<=n ;j++ )
			{
				
				if (i==0||j==0 ||i==n || j == n || i==j || i+j ==n || i ==n/2 || j == n/2)
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
