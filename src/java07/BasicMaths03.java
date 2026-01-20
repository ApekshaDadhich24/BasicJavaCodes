//You are given an integer n. You need to check whether the number is a palindrome number
// or not. Return true if it's a palindrome number, otherwise return false.
package java07;
import java.util.*;
public class BasicMaths03 {

    static int reverseNumber (int n ){
        int result = 0 ;
        while (n!=0) {
            int r = n % 10 ;
            result = result*10+r ;
            n=n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if palindrome or not : ");
        int num = sc.nextInt();
        int answer = reverseNumber(num);
        if (num == answer){
            System.out.println("Yes , number is palindrome");
        }else{
            System.out.println("No number is not palindrome");
        }
    }
}
