
import java.util.Scanner;

public class swap {
    public static void Swap(int a , int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("The A value is After Swapping "+a );
         System.out.println("The A value is After Swapping "+ b);
        

    } 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter One Number ");
        int a= sc.nextInt();
        System.out.println("Enter One Number ");
        int b= sc.nextInt();

        Swap(a, b);

    }
}
