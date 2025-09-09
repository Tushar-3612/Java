import java.util.Scanner;

public class Assi5 {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
         System.out.print("Enter You are Age ");
        int age = sc.nextInt();
       
        if(age>=18){
            System.out.println("You Are Eligible For Voting ");
        }else{
            System.out.println("You are not eligible ");
        }

    }
}
