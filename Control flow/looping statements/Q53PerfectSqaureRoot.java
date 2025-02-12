import java.util.Scanner;
class Q53PerfectSqaureRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		int sqrt = 0 ;
		boolean flag = false;
		for(int i =1;i<=num/2;i++) //num = 16 then 1 2 3 4 5 6 7 8 
		{
			if((i*i)>num)
				break;
			if(num==(i*i)) // OR We Can Use (num/i)==i //(16)==i (8)==2 (5)==3 (4)== 4
			{
				sqrt = i;
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.print("Number : "+num+" Sqrt Is "+sqrt);
		}
		else
		{
			System.out.print("Not A Perfect Sqrt Root");
		}
	}
}
