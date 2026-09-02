import java.util.Scanner;
public class GreaterThanAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        System.out.println("Average = " + average);
        System.out.println("Numbers greater than average = " + count);
    }
}