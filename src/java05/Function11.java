//takes age as input and prints if adult or not using functions
package java05;
import java.util.*;
public class Function11 {

    static String adultOrNot(int age){
        if (age > 18){
            return "Adult";
        }
        else{
            return "Not Adult";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        String answer = adultOrNot(age);
        System.out.println(answer);
    }
}
