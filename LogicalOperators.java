import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        System.out.println("Eligible: " + (age >= 18 && marks >= 35));
        System.out.println("Age or Marks Condition: " + (age >= 18 || marks >= 35));
        System.out.println("Not Eligible: " + !(age >= 18));
    }
}