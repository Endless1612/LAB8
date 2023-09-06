public class LAB8 {
    public static void main(String[] args) {
        System.out.println(" Multiplication Table");
        System.out.print(" ");

        for (int j = 9; j > 0; j--) {
            System.out.print("  " + j);
        }
        System.out.println();
        System.out.println("---------------------------------");

        for (int j = 9; j > 0; j--) {
            System.out.print(j + " |");

            for (int i = 9; i > 0; i--) {
                int result = j * i;
                if (result < 10) {
                    System.out.print(result + "  ");
                } else {
                    System.out.print(result + " ");
                }

            }

            System.out.println();

        }

    }

}
