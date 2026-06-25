import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        sc.nextLine();
        String course = sc.nextLine();
        double per = sc.nextDouble();

        System.out.println("Student Details");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("Course : " + course);
        System.out.println("Percentage : " + per);
    }
}
