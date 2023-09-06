public class piramid {
    public static void main(String[] args) {
        int numRows = 7; 

        
        int maxColumns = 2 * numRows - 1;

        for (int i = 0; i < numRows; i++) {
            
            for (int j = 0; j < numRows - i - 1; j++) {
                if (j < 10) {
                    System.out.print(" ");
                }
                System.out.print("   "); 
            }

            
            for (int j = 0; j <= i; j++) {
                int number = (int) Math.pow(2, j);
                System.out.printf("%4d", number); 
            }

            for (int j = i - 1; j >= 0; j--) {
                int number = (int) Math.pow(2, j);
                System.out.printf("%4d", number); 
            }

            
            System.out.println();
        }

    }
}
