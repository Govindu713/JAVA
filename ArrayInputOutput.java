import java.util.Scanner;
public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}