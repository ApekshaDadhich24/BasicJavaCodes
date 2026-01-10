// printing hello n number of times by taking n as user input
package java05;
import java.util.*;
public class Function08 {

    static void printHello(int n){
        for(int i = 1 ; i <= n ; i++){
            System.out.println("hello");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        printHello(n);

    }
}
