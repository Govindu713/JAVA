import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            }
            else {
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}