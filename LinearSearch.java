import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to Search: ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == search) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println(search + " is found");
        } else {
            System.out.println(search + " is not found");
        }
    }
}