class CubeNumberSeries {
    public static void main(String[] args) {
        int n = 7; 
        for (int i = 2; i <= n; i++) {
            int term = (i * i * i) + i; 
            System.out.print(term + " ");
        }
    }
}
