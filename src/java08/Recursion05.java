//You are given an integer n.
//Return the value of n! or n factorial.
//Factorial of a number is the product of all positive integers less than or equal
//to that number.

package java08;
import java.util.Scanner;
public class Recursion05 {

    static void factorial(int num , int a , int fact){
        if (a>num){
            System.out.println(fact);
            return;
        }
        fact=fact*a;
        factorial(num,a+1,fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        factorial(n,1,1);
    }
}
