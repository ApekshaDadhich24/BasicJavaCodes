//An armstrong number is a number which is equal to the sum of the digits of the number,
//raised to the power of the number of digits.
//Input: n = 153
//Explanation: Number of digits : 3.
//1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
//Therefore, it is an Armstrong number.

package java07;
import java.util.*;
public class BasicMaths06 {

    static double armstrongNum(int num){
        String number =String.valueOf(num);
        int length = number.length();
        double sum = 0 ;
        for (int i = 0 ; i<length ; i++){
            int j =number.charAt(i)-'0'; //converts char data type to int automatically w/o additional step of typecasting
            double exponent = Math.pow(j,length); // j raised to power length (a,b) ==> a raise to power b or a^b
            sum=sum+exponent ;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n : ");
        int n = sc.nextInt();
        double answer = armstrongNum(n);
        System.out.println(answer);
        if (answer==n){
            System.out.println("Yes, this is an Armstrong's number");
        }else{
            System.out.println("Not an Armstrong's number");
        }
    }
}
