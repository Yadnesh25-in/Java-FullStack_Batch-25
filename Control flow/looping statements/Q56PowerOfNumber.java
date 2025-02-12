import java.util.Scanner;
class Q56PowerOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,pow,powRes=1; 
		System.out.println("Enter Number : ");
		num = sc.nextInt();
		System.out.println("Enter Power : ");
		pow = sc.nextInt();
		for(int i=0;i<pow;i++)
		{
			powRes*=num;
		}
		System.out.println("Power Of "+num+" Is "+powRes);
	}
}
