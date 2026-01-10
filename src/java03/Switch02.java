// Perform operation on two numbers taken as input from user using switch case
package java03;
import java.util.*;
public class Switch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a :");
        int a = sc.nextInt();
        System.out.print("Enter value of b :");
        int b = sc.nextInt();
        System.out.println("Enter a choice between 1-5 : ");
        int choice = sc.nextInt();

        switch (choice){
            case 1: System.out.println("a + b ="+(a+b));
                break;
            case 2: System.out.println("a - b =" +(a-b));
                break;
            case 3 : System.out.println("a * b ="+(a*b));
                break;
            case 4 : System.out.println("a / b ="+ (a/b));
                break;
            case 5 : System.out.println("a % b ="+ (a%b));
                break;
            default : System.out.println("enter a valid choice");
                break;
        }

        sc.close();
    }
}
