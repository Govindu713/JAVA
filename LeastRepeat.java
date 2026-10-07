import java.util.Scanner;

public class LeastRepeat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int leastRepeated = arr[0];
        int minCount = n + 1;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                leastRepeated = arr[i];
            }
        }

        System.out.println("Least repeated element = " + leastRepeated);
        System.out.println("Frequency = " + minCount);
    }
}