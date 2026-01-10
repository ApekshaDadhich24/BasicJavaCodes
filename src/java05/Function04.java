// to print sum of two numbers using functions
package java05;
import java.util.*;
public class Function04 {

    static int inputNum(){ //can be used any number of time when wanted an integer input from user
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        return num;
    }

   static int sum(int A,int B){
     int sum = A+B;
     return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter value of a : ");
        int varA = inputNum();
        System.out.println("Enter value of b : ");
        int varB = inputNum();
        System.out.println("sum of A and B is : ");
        int summation = sum(varA,varB);
        System.out.println(summation);
    }


}
