import java.util.*;
public class Arrayproduct{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= a[i];
        }
        System.out.println("Product = " + product);
    }
}