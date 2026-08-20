import java.util.Scanner;

public class ContainsZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean found = false;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 0) {
                found = true;
                break;
            }

            n = n / 10;
        }

        if (found)
            System.out.println("Number contains 0");
        else
            System.out.println("Number does not contain 0");
    }
}