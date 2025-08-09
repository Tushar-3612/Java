
import java.util.Scanner;

public class Tabl{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter Nor ");
        int n =sc.nextInt();
        
        
        for(int i= 1 ;i<11;i++){
              System.out.println("The Table  " + i*n);

        }
    }
}