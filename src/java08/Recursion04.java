//Given an integer N, return the sum of first N natural numbers.
// Try to solve this using recursion.

package java08;
import java.util.Scanner;
public class Recursion04 {
    static void printSum(int num,int a,int sum){
        if (a>num){
            System.out.println("Sum of first n natural numbers : " + sum);
            return;
        }
        sum = sum + a;
        printSum(num,a+1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        printSum(n,1,0);
    }
}
