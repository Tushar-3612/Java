
import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        int count  = 1;
        for (int i = 1; i <= n; i++) {   // loop 1 se start
            count = count  * i;
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The Number ");
         int n  =sc.nextInt();
        int result = factorial(n);   
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
