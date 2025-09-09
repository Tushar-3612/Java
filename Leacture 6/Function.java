import java.util.Scanner;

public class Function{
    public static void MyName(String name){
        
         System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        MyName(name);
    }
}