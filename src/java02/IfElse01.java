// take age as input and check if a person can vote or not
package java02;
import java.util.*;
public class IfElse01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of person:");
        int age = sc.nextInt();
        if (age >18){
            System.out.println("the person can vote");
        }
        else{
            System.out.println("the person is underage, hence cant vote");
        }
        sc.close();
    }
}
