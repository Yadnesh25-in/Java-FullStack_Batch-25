import java.util.Scanner;
class Q64TemperatureConverter 
{
	public static void main(String[] args) 
	{
		int choice ;
		double temp ;
		Scanner sc =  new Scanner(System.in);
		while(true)
		{
			System.out.print("\033[H\033[2J"); 
			System.out.flush();
			System.out.println(" ******* Temperature Converter ******** ");
			System.out.println("Enter 1.Convert Celsius(C) To Fahrenheit (F), Kelvin (K), Rankine (R) ");
			System.out.println("Enter 2.Convert Fahrenheit (F) To Celsius(C), Kelvin (K), Rankine (R) ");
			System.out.println("Enter 3.Convert  Kelvin (K) To Celsius(C), Fahrenheit (F), Rankine (R) ");
			System.out.println("Enter 4.Convert Rankine (R) To Celsius(C), Fahrenheit (F), Kelvin (K) ");
			System.out.println("Enter 5.Exit");
			System.out.print("\n Enter Choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.print("\n Enter Temperature In Celsius (C) : ");
					temp = sc.nextDouble();
					sc.nextLine(); 
					System.out.println("Celsius (C) To Fahrenheit (F): "+ ((temp*9.0/5.0)+32.0));
					System.out.println("Celsius (C) To Kelvin (K): "+(temp + 273.15));
					System.out.println("Celsius (C) To Rankine (R): "+((temp+273.15)*(9.0/5.0)));
					System.out.print("Press Enter To Continue ");
					sc.nextLine();
					break;
				}
				case 2:
				{   System.out.print("\n Enter Temperature In Fahrenheit (F) : ");
					temp = sc.nextDouble();
					sc.nextLine(); 
					System.out.println("Fahrenheit (F) To Celsius (C):: "+((temp-32.0)*(5.0/9.0)));
					System.out.println("Fahrenheit (F) To Kelvin (K): "+((temp + 459.67)*(5.0/9.0)));
					System.out.println("Fahrenheit (F) To Rankine (R): "+(temp + 459.67));
					System.out.print("Press Enter To Continue ");
					sc.nextLine();
					break;
				}
				case 3:
				{
					System.out.print("\n Enter Temperature In Kelvin (K) : ");
					temp = sc.nextDouble();
					sc.nextLine(); 
					System.out.println("Kelvin (K) To Celsius (C):: " + (temp - 273.15));
					System.out.println("Kelvin (K) To Fahrenheit (F): " + ((temp * 9.0 / 5) - 459.67));
					System.out.println("Kelvin (K) To Rankine (R): " + (temp * 9.0 / 5));
					System.out.print("Press Enter To Continue ");
					sc.nextLine();
					break;
				}
				case 4:
				{
					System.out.print("\n Enter Temperature In Rankine (R) : ");
					temp = sc.nextDouble();
					sc.nextLine(); 
					System.out.println("Rankine (R) To Celsius (C):: " + ((temp - 491.67) * 5.0 / 9));
					System.out.println("Rankine (R) To Fahrenheit (F): " + (temp - 459.67));
					System.out.println("Rankine (R) To Kelvin (K): " + (temp * 5.0 / 9));
					System.out.print("Press Enter To Continue ");
					sc.nextLine();
					break;
				}
				case 5:
				{
					System.exit(0);
				}
				default:
				{
					sc.nextLine();
					System.out.println("Invalid Choice");
					System.out.print("Press Enter To Continue ");
					sc.nextLine();
				}
			}
		}
	}
}