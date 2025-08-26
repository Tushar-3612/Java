
//import java.awt.Choice;
import java.util.Scanner;

public class Assi7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive=0;
        int zero=0;
        int Negative=0;

        while (true) { 
           // int Y ,N ,n;
              System.out.println("Enter The Number");
             int num=sc.nextInt(); 

            if(num>0){
                System.out.println("Number IS positive ");
                positive++;
            }else if(num==0){
                System.out.println("Number is zero");
                zero++;
            }else{
                System.out.println("Number is Negative ");
                Negative++;
            }

            System.out.println("Do You Want To Continue (Y/N)");
            String choice = sc.next();

    if(choice.equalsIgnoreCase("N")){
    break;
         }
          
        }
        System.out.println("Total Positive Numbers: " + positive);
        System.out.println("Total Negative Numbers: " + Negative);
        System.out.println("Total Zeros: " + zero);

         

    }
}
