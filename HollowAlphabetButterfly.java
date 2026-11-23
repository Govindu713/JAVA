import java.util.Scanner;

public class HollowAlphabetButterfly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print((char)('A' + j - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                if (j == 1 || j == i || i == n) {
                    System.out.print((char)('A' + j - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print((char)('A' + j - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                if (j == 1 || j == i) {
                    System.out.print((char)('A' + j - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}