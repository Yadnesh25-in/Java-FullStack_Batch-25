class NumberPattern 
{
    public static void main(String[] args) 
	{
        int n = 6, num = 1;
        
        for (int i = 1; i <= n; i++) {
            int temp = num + i - 1; // Last number in the row
            for (int j = temp; j >= num; j--) // Print in reverse order
                System.out.print(j + " ");
            System.out.println();
            num = temp + 1; // Update start number
        }
    }
}


//   1
//	 3 2
//	 6 5 4
//	 10 9 8 7
//	 15 14 13 12 11 
