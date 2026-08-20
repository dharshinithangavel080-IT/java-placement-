import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Last Digit = " + n % 10);
    }
}