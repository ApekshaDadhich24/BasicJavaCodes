//Armstrongs number in a range


package java07;
import java.util.*;
public class BasicMaths10 {

    static void Armstrong(int n1, int n2){
        for (int i = n1 ; i<=n2 ; i++) {
            String num = String.valueOf(i);
            int length = num.length();
            double sum = 0;
            for (int j = 0; j < length; j++) {
                int k = num.charAt(j) - '0';
                double exponent = Math.pow(k, length);
                sum = sum + exponent;

            }
            if (i==sum) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter starting range : ");
        int n1 = sc.nextInt();
        System.out.print("Enter ending range : ");
        int n2 = sc.nextInt();
        Armstrong(n1,n2);
    }
}

