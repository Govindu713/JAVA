import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a double value::");
        double value=sc.nextDouble();
        System.out.println("The double value is:"+value);
        int num=(int) value;
        System.out.println("The integer value is:"+num);
    }
}