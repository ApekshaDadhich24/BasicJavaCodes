//Print name N times using recursion
package java08;
import java.util.*;
public class Recursion01 {

    static void printNames(int num,String name){
        if (num==0){
            return;
        }
        System.out.println(name);
        printNames(num-1,name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        printNames(n,name);
    }
}


