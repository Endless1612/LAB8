import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter nember : ");
        int number = input.nextInt();
        int remain = number;
        
        for (int n = number; n > 0; n--) {
            remain = n * remain;

        }

        System.out.println(remain);

    }

}
