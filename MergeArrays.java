import java.util.Scanner;
public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of First Array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter First Array Elements:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter Size of Second Array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter Second Array Elements:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int merged[] = new int[n1 + n2];
        for(int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        for(int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }
        System.out.println("Merged Array:");
        for(int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}