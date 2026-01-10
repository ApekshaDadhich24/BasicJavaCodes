// to check if a number is prime or not
package java04;
import java.util.*;
public class Loops05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of your choice : ");
        int num = sc.nextInt();
        if (num == 1 || num == 0) {
            System.out.println("neither prime nor composite ");
        } else
        {
            boolean isPrime = true; //flag variable -- used when explicit assignment is required
            for (int i = 2; i < Math.sqrt(num); i++) { //could have been i<num but sqrt minimizes number of iterations to half
                if ((num % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("number is prime");
            }
            else {
                System.out.println("number is not prime");
            }
        }
    }
}
