import java.util.Scanner;
public class LargestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is Largest");
        } else {
            System.out.println(b + " is Largest");
        }
    }
}