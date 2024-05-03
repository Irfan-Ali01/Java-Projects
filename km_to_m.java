import java.util.Scanner;

public class km_to_m {
    public static void main(String[] args) {
        Scanner km = new Scanner(System.in);
        System.out.println("Enter The Value: ");
        float a = km.nextInt();
        float b = a * 1000;
        System.out.println(b + " in Meter");
    }
}
