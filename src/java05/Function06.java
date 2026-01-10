// to print greater amoung two numbers using functions
package java05;
import java.util.*;
public class Function06 {

    static int inputNum(){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        return num;
    }

    static String max(int A,int B){
        if (A>B){
            return "A";
        }else{
            return"B";
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter value of a : ");
        int varA = inputNum();
        System.out.println("Enter value of b : ");
        int varB = inputNum();
        System.out.print("The greater value is of : ");
        String maximum = max(varA,varB);//input se leke jo value aayi hai woh function defiantion mein jake A or B mein store ho jayegi , it is like tranferring the value from varA and varB to A and B
        System.out.println(maximum);
    }

}
