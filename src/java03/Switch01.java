//Check the day of the week using switch
package java03;
import java.util.*;
public class Switch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice between 1-7:");
        int choice = sc.nextInt();
        switch (choice){
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("tuesday");
                break;
            case 3 : System.out.println("wednesday");
                break;
            case 4 : System.out.println("thursday");
                break;
            case 5 : System.out.println("friday");
                break;
            case 6 : System.out.println("saturday");
                break;
            case 7 : System.out.println("sunday");
                break;
            default : System.out.println("enter a valid choice");
                break;
        }

        sc.close();
    }
}
