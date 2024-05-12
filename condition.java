import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner iak = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int a = iak.nextInt();
        if (a >= 18) {
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed");
        }
    }
}