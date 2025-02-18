import java.util.Scanner;
class TrianglePattern1 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a length : ");
		int n = new Scanner(System.in).nextInt();
		
		for (int i = 0 ;i<=n;i++ )
		{
			for (int j = n;j>1 ;j++ )
			{
				if (j<n-i)
					System.out.print("*"+" ");
				else
					System.out.print(""+" ");
			}
			
			System.out.println();
		}
		
		}
}



