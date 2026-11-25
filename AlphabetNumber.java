import java.util.Scanner;

public class AlphabetNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j % 2 != 0) {
                    System.out.print((char)('A' + j / 2) + " ");
                } else {
                    System.out.print(j / 2 + " ");
                }
            }

            System.out.println();
        }
    }
}