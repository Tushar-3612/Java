
import java.util.Scanner;

public class Assi2 {
    public static void  SumFfOdd (int n){
        int sum =0;
        for(int i=0;i<=n;i++){
            if(i%2 !=0){
                sum+=i;

            }
        }
System.out.println("The sum Of 1 to " + n );
System.out.println(sum);

    }
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = sc.nextInt();
        SumFfOdd(n);
    }
}
