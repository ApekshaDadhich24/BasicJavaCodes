 //Given a string s, reverse it and find if it  is a palindrome or not using recursion

package java08;
import java.util.Scanner;
public class Recursion07 {

    static String checkPalindrome(String word , int length,String name){
        if (length == 0){
            return name;
        }
        name = name + word.charAt(length-1);
        return checkPalindrome(word,length-1,name);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String s = sc.next();
        String answer = checkPalindrome(s,s.length(),"");
        System.out.println(answer);
        if (s.equals(answer)){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
