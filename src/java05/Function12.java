// take n as input , check whether positive , negative or zero using function
package java05;
import java.util.*;
public class Function12 {

    static String positiveNegative(int A){
        if (A>0){
            return "Positive";
        }
        else if (A<0){
            return " Negative";
        }else{
            return "Zero";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        String answer = positiveNegative(n);
        System.out.println(answer);
    }
}
