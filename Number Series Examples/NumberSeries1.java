import java.util.Scanner;
class NumberSeries			//2 6 22 278 65814
{
	public static void main(String[] args) 
	{
		int two = 2;
		int pow = 1 ;
		long prev = 2;
		System.out.print("Enter Range : ");
		int num = new Scanner(System.in).nextInt();
		int powRes = 2;
		
		for(int i=0; i<num;i++)
		{
			for(int j = 1 ; j<=pow;j++)
			{
				powRes*=2;
			}	
			System.out.print(prev+" ");
			prev=powRes+prev;
			pow*=2;
		}
	}
}
