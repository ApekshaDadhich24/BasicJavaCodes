// Armstrong's numbers from another approach

package java07;
import java.util.Scanner;
public class BasicMaths07 {

    static int countDigits(int n) {
        int count = 0 ;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    static double reverseNum(int num){
        int r = 1 ;
        double sum = 0;
        int store = countDigits(num);
        while (num!=0) {
            r = num % 10 ;
            double power = Math.pow(r,store);
            sum = sum+power;
            num = num / 10 ;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        double answer = reverseNum(num);
        System.out.println(answer);
        if (num == answer){
            System.out.println("Yes this is an Armstrong's number");
        }else{
            System.out.println("Not an Armstrong's number");
        }
    }
}
