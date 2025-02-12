import java.util.Scanner;
class PowerOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Enter power : ");
		int pow = sc.nextInt();
		int op = 1;
		
		for (int i = 1;i<=pow ;i++ )
		{
			op*=num;
		}
		System.out.println(num+ "^"+ pow+ " = "+op);
		
	}
}
