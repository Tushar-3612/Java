
import java.util.Scanner;

public class ifelse{

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter Number");
        int x= sc.nextInt();

        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}