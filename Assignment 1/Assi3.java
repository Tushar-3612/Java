
import java.util.Scanner;

public class Assi3 {
    public static void Greaternumber(int a ,int b){
        if(a>b){
            System.out.println(a+ " A is Greter Than " +b);
        }else{
            System.out.println(b+ " B Is Greater Than A " +a);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter Number 1");
         int num1= sc.nextInt();
         System.out.println("Enter Number 2");
         int num2= sc.nextInt();
        Greaternumber(num1,num2);
    }
    

}
