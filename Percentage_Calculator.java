import java.util.Scanner;

public class Percentage_Calculator {
    public static void main(String[] args) {
        Scanner irfan = new Scanner(System.in);
        double total_marks = 500;
        System.out.println("Enter Obt MArks in OOPS : ");
        double a = irfan.nextInt();
        System.out.println("Enter your Marks in DLD : ");
        double b = irfan.nextInt();
        System.out.println("Enter Your MArks in P.Study: ");
        double c = irfan.nextInt();
        System.out.println("Enter Your Marks in Communication Skills: ");
        double d = irfan.nextInt();
        System.out.println("Enter your Marks in Linear Algebra: ");
        double e = irfan.nextInt();
        double obt_marks = a + b + c + d + e;
        System.out.println("Your Percentage is: ");
        double prctage = obt_marks / total_marks * 100;
        System.out.println(prctage);
    }
}
