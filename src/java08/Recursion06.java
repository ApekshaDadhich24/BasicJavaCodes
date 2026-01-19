//fibonacci series
// 0 1 1 2 3 5 8
package java08;
import java.util.*;
public class Recursion06 {

    static void calcFibonacci(int num,int a ,int b ){
       if (num==0){
           return;
       }
        System.out.println(a); //0 1 1 2 3
        calcFibonacci(num-1,b,a+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end value : ");
        int num = sc.nextInt();
        calcFibonacci(num,0,1);
    }
}
