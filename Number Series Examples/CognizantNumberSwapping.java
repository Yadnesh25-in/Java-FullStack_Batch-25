import java.util.Scanner;
class CognizantNumberSwapping
{
	public static void main(String[] args) 
	{
		int arr[] = new int[127];
		int max = 0 ;
		System.out.println("Enter Name : ");
		String name = new Scanner(System.in).nextLine();
		int spaceCount = 0 ;
		for(int i=0;i<name.length();i++)
		{	
			if(name.charAt(i)==' ')
				spaceCount++;
			arr[name.charAt(i)]++;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				if(arr[i]>max)
					max=arr[i];
			}			
		}
		System.out.println(name.length()-(max+spaceCount));
	}
}