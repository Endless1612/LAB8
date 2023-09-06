import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter nember : ");
        int number = input.nextInt();
        int store = 1;

        for (int n = number; n > 0; n--) {
            int temp = n;
            n--;
            int temp2 = temp * n;

            store = store * temp2;

            System.out.println("= " + store);

        }

    }
}
