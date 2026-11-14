import java.util.Scanner;

public class HollowAlphabetTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {

                if (i == 1 || j == 1 || j == n - i + 1) {
                    System.out.print((char)('A' + j - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}