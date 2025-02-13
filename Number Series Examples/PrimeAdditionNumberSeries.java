class PrimeAdditionNumberSeries {
    public static void main(String[] args) {
        int term = 79, num = 29, count = 0;
        int totalRange = 10; 

        System.out.print(term + " ");

        while (count < totalRange - 1) {
            boolean flag = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                term += num;
                System.out.print(term + " ");
                count++;
            }
            num++;
        }
    }
}
