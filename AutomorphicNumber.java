import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;
        int digits = 1;

        while (temp >= 10) {
            digits = digits * 10;
            temp = temp / 10;
        }

        if (square % (digits * 10) == n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}