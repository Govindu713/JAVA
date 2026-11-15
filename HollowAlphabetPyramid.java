import java.util.Scanner;

public class HollowAlphabetPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print alphabets and inner spaces
            for (int j = 1; j <= 2 * i - 1; j++) {

                if (i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print((char)('A' + j - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}