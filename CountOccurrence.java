import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter digit to search: ");
        int search = sc.nextInt();

        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit == search)
                count++;

            n = n / 10;
        }

        System.out.println("Occurrence = " + count);
    }
}