import java.util.Scanner;

public class AlphabetX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j == i || j == n - i + 1) {
                    System.out.print((char)('A' + i - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}