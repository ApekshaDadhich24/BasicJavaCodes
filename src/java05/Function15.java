//factorial of n , take n from user , using fucntions
package java05;
import java.util.*;
public class Function15 {

    static int factorial (int num){
        int fact = 1;
        for (int i = num ; i >= 1 ; i--){
            fact = i*fact;

        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int answer =factorial(n);
        System.out.println(answer);

    }
}

//dry run
// num = 4 , 4>1 , enters loop , 4*1=fact , i-- == 4=4-1 = 3 (updated value of i )
// now num = 3 , 3 >1 ,enters loop , 3 * 4 = fact , , i-- == 3-- = 3-1 =2 (updated value of i )
// now num = 2 , 2>1 , enters loops , 2*12 = fact , i-- = 1 Updated value of i
// now num = 1 , 1>=1 , enters loop , 24 * 1 = fact , i-- = 0 updated value of i

//return fact = 24
//factorial (n)
//    answer
//sout
