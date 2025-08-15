import java.util.Scanner;

public class SumAndAverage {
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static double Average(int a, int b) {
        double Ave = (a + b) / 2.0;
        return Ave;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum: " + sum(a, b));
        System.out.println("Average: " + Average(a, b));
    }
}