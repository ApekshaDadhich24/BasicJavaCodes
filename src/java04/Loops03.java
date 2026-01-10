// print even numbers till n , take n from user
package java04;
import java.util.*;
public class Loops03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n:");
        int n = sc.nextInt();
        for(int i = 0 ; i <=n ; i=i+2){
                System.out.println(i);
        }
    }
}
