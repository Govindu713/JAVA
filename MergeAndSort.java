import java.util.Scanner;

public class MergeAndSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];

        System.out.println("Enter first array elements:");

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];

        System.out.println("Enter second array elements:");

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int merged[] = new int[n1 + n2];

        int index = 0;

        for (int i = 0; i < n1; i++) {
            merged[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < n2; i++) {
            merged[index] = arr2[i];
            index++;
        }

        // Sorting
        for (int i = 0; i < merged.length - 1; i++) {

            for (int j = i + 1; j < merged.length; j++) {

                if (merged[i] > merged[j]) {

                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        System.out.println("Merged and sorted array:");

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}