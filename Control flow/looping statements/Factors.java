import java.util.Scanner;
class Factors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBBER : ");
		int num = sc.nextInt();
		int cnt = 0;
		
		for (int i =1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				cnt++;
				System.out.println(i);
			}
			

		}
		System.out.println();
		System.out.println("Count is : "+cnt);
	}
}
