import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int dem = 2;
		
		while (dem<=num/2)
		{
			if (num%dem==0)
			{
				System.out.println("Not Prime"); 
				break;
			}
			dem++;
		}
		
		if (dem > num/2) 
		{
			System.out.println("Its a Prime");
			boolean flag = true;
			
			
			
		}
	}
}
