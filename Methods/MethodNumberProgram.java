class MethodNumberProgram {
    public static void main(String[] args) {
        primeOrNot(22);
       // primeRange(50);
        //evenOrNot(12);
        //power(2, 5);
        //factorial(5);
        //reverseNum(1234);
        //reverseString("Hello");
    }

    public static void primeOrNot(int a)
		{
        if (a <= 1) {
            System.out.println(a + " is NOT Prime");
            return;
        }
        for (int i = 2; i * i <= a; i++) {  // Optimized loop
            if (a % i == 0) {
                System.out.println(a + " is NOT Prime");
                return;
            }
        }
        System.out.println(a + " is Prime");
		}

    public static void primeRange(int a) 
		{
        System.out.println("Prime numbers from 1 to " + a + ":");
        for (int i = 2; i <= a; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {  // Optimized loop
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println();
		}

    public static void evenOrNot(int a)
		{
        System.out.println(a + " is " + (a % 2 == 0 ? "Even" : "Odd") + " Number");
		}

    public static void power(int num, int p) 
		{
        int result = (int) Math.pow(num, p);  // Using built-in Math.pow()
        System.out.println(num + "^" + p + " = " + result);
		}

    public static void factorial(int a)
		{
        int fact = 1;
        for (int i = 2; i <= a; i++) fact *= i;
        System.out.println(a + "! = " + fact);
		}

    public static void reverseNum(int a)
		{
        int rev = 0, temp = a;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse of " + a + " is: " + rev);
		}

    public static void reverseString(String str)
		{
        String reversed = new StringBuilder(str).reverse().toString();  // Using StringBuilder
        System.out.println(str + " reversed is: " + reversed);
		}
}
