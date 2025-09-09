
import java.util.Scanner;



public class Ass1{
    public static void main(String[] args) {
        int marks []= new int[50];

        Scanner sc= new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Physics " +marks[0]);
        System.out.println("math " +marks[1]);
        System.out.println("java " +marks[2]);
        int total = marks[0]+marks[1]+marks[2];
        int average = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("The total mark you obtained " +total);
        System.out.println("The Percentage  Of Total Marks " +average +"%");

        System.out.println("Array Of Length" +marks.length);

    }
}