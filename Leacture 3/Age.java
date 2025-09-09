 import java.util.*;
 public class Age{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Age ");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("You are not adult");
        }

    }
 }