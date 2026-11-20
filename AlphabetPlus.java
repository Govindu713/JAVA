import java.util.Scanner;

public class AlphabetPlus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number of rows: ");
        int n = sc.nextInt();

        if (n % 2 == 0 || n < 1) {
            System.out.println("Please enter a positive odd number.");
        } else {

            int mid = n / 2 + 1;

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n; j++) {

                    if (i == mid) {
                        System.out.print((char)('A' + j - 1) + " ");
                    } 
                    else if (j == mid) {
                        System.out.print((char)('A' + i - 1) + " ");
                    } 
                    else {
                        System.out.print("  ");
                    }
                }

                System.out.println();
            }
        }
    }
}