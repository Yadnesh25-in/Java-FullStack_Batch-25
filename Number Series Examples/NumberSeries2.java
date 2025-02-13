class FactorialNumberSeries {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i; 
            sum += fact; 
            System.out.print(sum + " ");
        }
    }
}
