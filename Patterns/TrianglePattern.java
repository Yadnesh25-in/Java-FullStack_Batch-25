import java.util.Scanner;
class TrianglePattern 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a length : ");
		int n = new Scanner(System.in).nextInt();
		
		for (int i = 0;i<n;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
				if (j<n-i-1)
					System.out.print(""+" ");
				else
					System.out.print("*"+" ");
			}
			
			System.out.println();
		}
		
		}
}
