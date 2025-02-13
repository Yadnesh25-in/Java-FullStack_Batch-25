import java.util.Scanner;
class FibonacciNumberSeries 
{
  public static void main(String[] args)
	{
		System.out.println("Enter range : ")
		int range = new Scanner(System.in).nextInt();
        int a = 0, b = 1; 

        for (int i = 2; i < range; i++) 
		{
			
            int next = a + b; 
            System.out.print(next + " ");
            a = b; 
            b = next; 
		}
    }
}
