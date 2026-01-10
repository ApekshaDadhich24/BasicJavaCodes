//sum of n natural numbers
package java05;
import java.util.*;
public class Function16 {

    static int input(){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    static int sumOfNatural (int num){
        int sum  = 0 ;
        for(int i  = num ; i >= 1 ; i --){
           sum = sum + i  ;

        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter value of n : ");
        int a = input();
        int answer = sumOfNatural(6);
        System.out.println(answer);
    }
}
