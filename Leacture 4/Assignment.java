
import java.util.Scanner;

 public class Assignment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       while (true) { 
           
        System.out.println("Enter You Are choice : ");
        System.out.println("If You Want to check Grade or Good Response press (1)");
        System.out.println("If You Want to exit press 0");
        int choice = sc.nextInt();

         switch(choice){
            case 0 : 
            System.out.println("Exit The Programme ");
            return;

            case 1:
            System.out.println("Enter The Mark ");
            int mark=sc.nextInt();
          

            if(mark >=90){
                System.out.println("Excellent Preformance , keep it up");
            } else if (mark >60){
                System.out.println("Mark Are  good  ");
            }else{
                System.out.println("Mark Are be good");
                System.out.println("Marks don't matter, but your efforts do !  ");
            }
            break;

            default:
            System.out.println("Enter correct choice ");
         }


       }
    }
 }