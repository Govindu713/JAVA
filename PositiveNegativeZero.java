import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                positive++;
            } else if(arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive Numbers = " + positive);
        System.out.println("Negative Numbers = " + negative);
        System.out.println("Zeros = " + zero);
    }
}