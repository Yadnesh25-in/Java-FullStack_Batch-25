import java.util.Scanner;
class Q63EvenOddNumberUsingLength 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int temp = num ;
		int count = 0,rem; 
		String res = "";
		while(num>0)
		{
			num/=10;
			count++;
		}
		num = temp;
		temp = 0 ;
		
		if(count%2==0)
		{
			int i = 1 ;
			while(num>0)
			{
				rem = num%10;
				if(rem%2!=0 && rem!=9)
				{
					rem++;
				}
				else if(rem==9)
				{
					rem--;
				}
				temp=temp+(rem*i);
				i *=10;
				num/=10;
				
			}
			System.out.println(temp);
		}
		else
		{
			int i = 1 ;
			while(num>0)
			{
				rem = num%10;
				if(rem%2==0 && rem!=9)
				{
					rem++;
				}
				else if(rem==9)
				{
					rem--;
				}
				temp=temp+(rem*i);
				i *=10;
				num/=10;
			}
			System.out.println(temp);
		}

	}
}
