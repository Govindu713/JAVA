import java.util.Scanner;

public class AlternatingAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("A ");
                } else {
                    System.out.print("B ");
                }
            }

            System.out.println();
        }
    }
}