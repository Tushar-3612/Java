
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
 
         System.out.println("Enter Two Number");
         int a = sc.nextInt();
         int b = sc.nextInt();     
        while (true)  { 
            System.out.println("====================Calulator====================");
            System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exist ");
            int button = sc.nextInt();
         
         
        switch(button){

            case 1: 
            int result = a+b;
            System.out.println("Addition Of Two Numbers " +result);
            break;

            case 2 : 
            int Subtraction = a-b;
            System.out.println("Subtraction of you are number :- " +Subtraction);
            break;

            case 3 :
            int Multiplication = a*b;
            System.out.println("Multiplication Of You are number " +Multiplication);
            break;
            case 4:
            if (b != 0) {
                        float division = (float) a / b;
                        System.out.println("Division of the two numbers: " + division);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
            case 5: System.out.println("Exit The Program");
            return;

             
            
            default : System.out.println("Pleae choose coreect ");
            break;


        }

    }
}
}
