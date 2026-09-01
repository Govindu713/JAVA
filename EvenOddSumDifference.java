import java.util.Scanner;
public class EvenOddSumDifference {
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
            } else {
                oddSum = oddSum + arr[i];
            }
        }
        int difference = evenSum - oddSum;
        System.out.println("Sum of Even Elements = " + evenSum);
        System.out.println("Sum of Odd Elements = " + oddSum);
        System.out.println("Difference = " + difference);
    }
}