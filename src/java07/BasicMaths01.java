//You are given an integer n. You need to return the number of digits in the number.
//The number will have no leading zeroes, except when the number is 0 itself.
package java07;
import java.util.Scanner;
public class BasicMaths01 {

    static int CountDigits (int n) {
        int count = 0;
        if (n == 0) return 1;
        while (n != 0) {
            n = n / 10;
            count++;
            }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the value of num : ");
        int num = sc.nextInt();
        int answer =  CountDigits(num);
        System.out.println(answer);
    }
}



