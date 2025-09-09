import java.util.Scanner;

public class Loop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n= sc.nextInt();
        int sum =0;
        for(int j =0 ; j<=n;j++){
            sum = sum+j;
        }
        System.out.println("You are Addition " +sum);

         
    }
}