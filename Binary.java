import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements in ascending order:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int position = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == search) {
                position = mid;
                break;
            }
            else if (search > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (position != -1) {
            System.out.println("Element found at index = " + position);
        }
        else {
            System.out.println("Element not found");
        }
    }
}