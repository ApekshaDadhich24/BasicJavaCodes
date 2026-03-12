package java07;
import java.util.*;
public class hello {

    static int countDigit(int n){
        int count = 0 ;
        while (n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    static double armstrongs(int n , int count){
        double sum = 0;

        while (n!=0){
            int mod = n%10;
            double power = Math.pow(mod,count);
            sum = power + sum;
            n=n/10;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int count = countDigit(n);
        System.out.println("number of digits are : "+ count);
        double result = armstrongs(n,count);
        System.out.println("the result is : " + result );
        if (n==result){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
