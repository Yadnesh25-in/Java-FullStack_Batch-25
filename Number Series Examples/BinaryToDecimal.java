import java.util.Scanner;
class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
			System.out.println("Enter Number : ");
			long num = new Scanner(System.in).nextInt();
			long temp = num ;
			int pow = 1 ,dec = 0;
			while(temp>0)
			{
				if((temp%10)==1)
					dec += pow;
				pow*=2;
				temp/=10;
			}	
			System.out.println("Decimal : "+dec);
	}
}