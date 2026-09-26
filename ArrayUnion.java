import java.util.Scanner;

public class ArrayUnion {
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

        int union[] = new int[n1 + n2];
        int size = 0;

        // Add elements of first array
        for (int i = 0; i < n1; i++) {

            boolean exists = false;

            for (int j = 0; j < size; j++) {
                if (union[j] == arr1[i]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                union[size] = arr1[i];
                size++;
            }
        }

        // Add elements of second array
        for (int i = 0; i < n2; i++) {

            boolean exists = false;

            for (int j = 0; j < size; j++) {
                if (union[j] == arr2[i]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                union[size] = arr2[i];
                size++;
            }
        }

        System.out.println("Union of two arrays:");

        for (int i = 0; i < size; i++) {
            System.out.print(union[i] + " ");
        }
    }
}