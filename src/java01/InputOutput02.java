// Sum of two numbers by taking input from the user
package java01;
import java.util.*;
public class InputOutput02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter num1:");
        int num1 = sc.nextInt();
        System.out.println("enter num2:");
        int num2 = sc.nextInt();
        System.out.println("the numbers are :");
        System.out.println(num1);
        System.out.println(num2);
        int sum = num1+num2 ;
        System.out.println("the sum is :");
        System.out.println(sum);
        sc.close();
    }

}
