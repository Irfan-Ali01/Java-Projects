import java.util.Scanner;

public class cgpa_calculator {
    public static void main(String[] args) {
        Scanner five = new Scanner(System.in);
        System.out.println("Enter Marks of OOPS: ");
        float a = five.nextInt();
        System.out.println("Enter Marks of DLD: ");
        float b = five.nextInt();
        System.out.println("Enter Marks Of P.Study: ");
        float c = five.nextInt();
        System.out.println("ENter Marks Of Linear Algebra: ");
        float d = five.nextInt();
        System.out.println("Enter Marks Of Communication Skills: ");
        float e = five.nextInt();
        float f = a + b + c + d + e;
        float g = f / 50;
        System.out.println("The Total Cgpa is: ");
        System.out.println(g);
    }
}
