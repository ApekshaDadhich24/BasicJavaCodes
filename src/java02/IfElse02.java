//Take input of a number and check if its positive , negative or zero
package java02;
import java.util.*;
public class IfElse02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        if (number ==0){
            System.out.println("the number is zero");
        }
        else if (number > 0){
            System.out.println("the number is positive");
        }
        else{
            System.out.println("the number is negative");
        }
        sc.close();
    }
}
