import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int si = p * r * t / 100;

        System.out.println("Simple Interest = " + si);
        System.out.println("Amount = " + (p + si));
    }
}
