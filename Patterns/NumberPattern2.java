class NumberPattern2 {
    public static void main(String[] args) {
        int num = 1;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            
            for (int j = 1; j <= 5; j++) {
                if (j > 5 - i) {
                    num++;
                    System.out.print("       " + num);
                }
            }
            
            System.out.println();
        }
    }
}