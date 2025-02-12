import java.util.Scanner;
class NumberExample 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		int even = 0;
		
		while (num>0)
		{
			int rem = num%10;
			sum +=rem;
			num /=10;
			
			if (rem%2==0)
			{
				even+=rem;
			}
		}	
			//System.out.println(sum);
			//System.out.println(dup);
			System.out.println(even);
			
			
			
		
		
	}
}
