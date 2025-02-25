import java.util.Scanner;
class DecimalToBinaryUsingStringMethod
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int num1 = num ;
		String bin = Integer.toBinaryString(num);
		System.out.println(num1+ " : "+bin);
	
	}
}