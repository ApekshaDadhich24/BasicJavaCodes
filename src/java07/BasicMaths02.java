//You are given an integer n. Return the integer formed by placing the digits of n in reverse
//order.

package java07;
import java.util.*;
public class BasicMaths02 {

    static void reverseNumber (int n ){
        int r = 1 ;
        while (n!=0) {
            r = n % 10 ;
            System.out.print(r);
            n = n / 10 ;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to be reversed : ");
        int num = sc.nextInt();
        reverseNumber(num);
    }
}
