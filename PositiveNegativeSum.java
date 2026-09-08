import java.util.Scanner;
public class PositiveNegativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positiveSum = positiveSum + arr[i];
            }
            else if (arr[i] < 0) {
                negativeSum = negativeSum + arr[i];
            }
        }
        System.out.println("Sum of positive numbers = " + positiveSum);
        System.out.println("Sum of negative numbers = " + negativeSum);
    }
}