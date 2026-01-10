// to check if a number is even or odd using functions
package java05;
import java.util.*;
public class Function05 {

    static int inputNum(){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        return num;
    }

    static String evenOdd(int num){
        if(num%2==0){
            return "even";
        }
        else{
            return "odd";        }
    }

    public static void main(String[] args) {
        System.out.println("Enter value of a : ");
        int num = inputNum();
        System.out.println("checking if even or odd : ");
        String checkEven= evenOdd(num);
        System.out.println(checkEven);

    }

}
