// takes 3 numbers as an input and return the larget number using functions
package java05;
import java.util.*;
public class Function13 {

    static int input(){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    static String largestNum (int A,int B , int C){
        if (A>B && A>C){
            return "A is Greatest";
        }else if(B>A && B>C){
            return "B is Greatest";
        }else{
            return "C is greatest";
        }
    }

    public static void main(String[] args) {
        System.out.println("Lets take input of three numbers : ");
        System.out.print("Enter number 1 : ");
        int num1 = input();
        System.out.print("Enter number 2 : ");
        int num2 = input();
        System.out.print("Enter number 3 : ");
        int num3 = input();
        String answer = largestNum(num1,num2,num3);
        System.out.println(answer);

    }
}
