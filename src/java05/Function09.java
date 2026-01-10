//to take a number input from user and calculate its square using functions
package java05;
import java.util.*;
public class Function09 {

    static int squareNum(int A){
        int square = A*A;
        return square;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number to be squared : ");
        int n = sc.nextInt();
        int value=squareNum(n);
        System.out.println("the square of this number is : " + value);
    }
}
