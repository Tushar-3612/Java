
import java.util.Scanner;

public class Assi4 {
    public static double Circumference(double radius ){
        double Circumference =2*Math.PI*radius;
        return Circumference;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius ");
        double radius=sc.nextDouble();

        double ans =Circumference(radius);
        System.out.print("The Radius of " +ans);

    }
}
