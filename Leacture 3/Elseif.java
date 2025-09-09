
import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Two Numbers ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==b){
            System.out.println("No is Same ");
        }else if(a>b){
                System.out.println("A is greater");
            }else{
                System.out.println("B is Greater");
            }
        }

    }

