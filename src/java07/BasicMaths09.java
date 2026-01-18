//fibonacci series
// 0 1 1 2 3 5 8
package java07;
import java.util.*;
public class BasicMaths09 {

    static void calcFibonacci(int num,int a ,int b ){
        int fibonacci = 0 ;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3 ; i<=num ; i++) {
            fibonacci = a+b;
            System.out.println(fibonacci);
            a=b;
            b=fibonacci;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter end value : ");
    int num = sc.nextInt();
    calcFibonacci(num,0,1);
    }
}
