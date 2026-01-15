//You are given an integer n. You need to find all the divisors of n.
// Return all the divisors of n as an array or list in a sorted order.

package java07;
import java.util.*;
public class BasicMaths08 {

    static void divisors(int num) {
        System.out.print("[");
        for (int i = 1; i <num; i++) {
            if (num % i == 0) {
                System.out.print(i+",");
            }
        }
        System.out.print(num+"]");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number n : ");
        int n = sc.nextInt();
        divisors(n);
    }
}
