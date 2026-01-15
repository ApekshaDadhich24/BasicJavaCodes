//You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers.
//Return the GCD of the two numbers.
package java07;
import java.util.*;
public class BasicMaths04 {
    static int input(){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    static void GCD (int num1 , int num2) {
        int result=1;
        for (int i = 1; i <= num1 && i<= num2; i++) {
            if (num1%i==0 && num2%i == 0) {
                result = i;
            }
        }
        System.out.println("The GCD of a and b is : " + result);
    }

    public static void main(String[] args) {
        System.out.print("Enter num1 : ");
        int a = input();
        System.out.print("Enter num2 : ");
        int b = input();
        GCD(a,b);
    }
}
