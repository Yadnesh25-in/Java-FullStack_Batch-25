import java.util.Scanner;

class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        sc.close();
		
		
        if (num.contains("0") && num.charAt(0) != '0') 
            System.out.println(num + " is a Duck Number.");
		
        else 
            System.out.println(num + " is NOT a Duck Number.");
        
    }
}
