import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose button (1,2,3)");
        int button = sc.nextInt();


        switch(button){
            case 1 :System.out.println("Hello");
            break;
            case 2 : System.out.println(".(Namaste)");
            break;
            case 3 : System.out.println(".(I Don't Know)");
            break;
            default:System.out.println(".(please chooce correct button )");
        }

    }
}
