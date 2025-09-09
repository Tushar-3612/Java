
import java.util.Scanner;

public class Prime {
   public static void isPrime(int n){
    if(n<=1){
        System.out.println(n+"Is not prime ");
        return;
    } 
     boolean isPrime=true;
     
      
    for(int i=2;i<=n-1;i++){
        if( n%i==0){
            isPrime=false;
            break;
        }
    }if(isPrime){
        System.out.println(n+" Number is prime ");
    }else{
        System.out.println(n+" number is Not prime ");
    }
    
   }
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        
       for(int j=1;j<=10;j++){

       isPrime(j);
       }
   }
}
 