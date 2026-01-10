//to print prime numbers between a given range
package java04;
import java.util.*;
public class Loops06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing prime number between a given range ");
        System.out.print("enter lower limit: ");
        int a = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int b = sc.nextInt();

        boolean isPrime = true;
        for (int num = a; num < b; num++) { // loop for number within the range
            for (int i = 2; i < num; i++) { // loop for a number i that divides num to check prime or not
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
            isPrime = true;
        }

    }
}



