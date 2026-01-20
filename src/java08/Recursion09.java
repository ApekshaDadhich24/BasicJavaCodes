//Given a string s, return true if the string is palindrome, otherwise false.
//A string is called palindrome if it reads the same forward and backward.

package java08;
import java.util.Scanner;
public class Recursion09 {

    static boolean checkPalindrome(String s,int fwd , int bwd ){
        if (fwd>=bwd){
            return true ;
        }
        if (s.charAt(fwd)==s.charAt(bwd)){
           return checkPalindrome(s,fwd+1,bwd-1);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        boolean answer = checkPalindrome(s,0,s.length()-1);
        System.out.println(answer);
    }
}
//hannah fwd 0 bwd 5 0 == 5
// 1 == 4
//2 == 3
// 3 == 2
