//Print name N times using recursion
package java08;
import java.util.*;
public class Recursion01 {

    static void printNtimes(int num,String name){
        if (num==0){
            return;
        }
        System.out.println(name);
        printNtimes(num-1,name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        printNtimes(n,name);
    }
}


