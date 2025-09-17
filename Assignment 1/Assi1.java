import java.util.Scanner;

public class Assi1{
     public static double Average(int a , int b ,int c ){
         
      double ans= (a+b+c)/3.0;
          return ans;
          
     }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter The Number 1");
    int num1= sc.nextInt();
    System.out.println("Enter The Number 2");
     int num2= sc.nextInt();
    System.out.println("Enter The Number 3");
     int num3= sc.nextInt();
    double ans = Average(num1,num2,num3);
     System.out.println("The Average Of "+ans);
}
}


