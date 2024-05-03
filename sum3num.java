import java.util.Scanner;

public class sum3num {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Your 1st Value: ");
        int a = ss.nextInt();
        System.out.println("Enter your 2nd Value: ");
        int b = ss.nextInt();
        System.out.println("Enter your 3rd Value: ");
        int c = ss.nextInt();
        int d = a + b + c;
        System.out.println("Sum Of Values is ");
        System.out.println(d);
    }
}
