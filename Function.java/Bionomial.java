
import java.util.Scanner;

public class Bionomial {
    public static int Factorial(int n){
        int count =1;
        for(int i=1;i<=n;i++){
            count =count *i;
        }
        return count ;

    }
    public static int Biocoeff(int n,int r){
        int n_fact =Factorial(n);
        int r_fact =Factorial(r);
        int nmr_fact=Factorial(n-r);  // nmr = n-m it is 

        int result = n_fact / (r_fact*nmr_fact);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter Value OF n ");
        int n= sc.nextInt();
        System.out.print("Enter The Value of r ");
        int r = sc.nextInt();

        int result =Biocoeff(n, r);
        System.out.println("The Result is "+result);

    }
    
}
