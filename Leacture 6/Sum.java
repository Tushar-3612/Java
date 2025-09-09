//using funnction it is a basic code
import java.util.Scanner;
public class Sum {
    public static int CalculateSum(int a ,int b){
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER ");
        int a= sc.nextInt();
        System.out.print("ENTER THE NUMBER ");
        int b = sc.nextInt();
         
        int result=CalculateSum(a, b);
        
        System.out.println("The Addition Of two Numbers "+result);
         
    }
}
