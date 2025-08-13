import java.util.Scanner;

public class Division {
   public static int CalculateProduct(int a ,int b){
    return a*b;
   } 
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER ");
        int a= sc.nextInt();
        System.out.print("ENTER THE NUMBER ");
        int b = sc.nextInt();
         
         
        
        System.out.println("The Addition Of two Numbers "+CalculateProduct(a, b));
         
   }
}
