import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12");
        int month= sc.nextInt();
        switch(month){
            case 1:System.out.println("Jan");
            break;
            case 2: System.out.println("Feb");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("Octomber");
            break;
            case 11: System.out.println("November"); 
            break;
            case 12 : System.out.println("December");
            break;
            default: System.out.println("Invalid choice");
        }
    }
    
}
