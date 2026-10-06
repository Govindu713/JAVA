import java.util.Scanner;

public class CountDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicateCount = 0;

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {

                boolean alreadyCounted = false;

                for (int k = 0; k < i; k++) {

                    if (arr[i] == arr[k]) {
                        alreadyCounted = true;
                        break;
                    }
                }

                if (!alreadyCounted) {
                    duplicateCount++;
                }
            }
        }

        System.out.println("Number of duplicate elements = " + duplicateCount);

    }
}