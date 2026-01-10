//print number 1 to n in series by taking n as input from user
package java05;
import java.util.*;
public class Function14 {

    static void inSeries(int num){
        for(int i = 1 ; i <=  num ; i++){
            System.out.println(i);
        }
        return;
    }
    public static void main(String[] args) {
        System.out.println("Printing numbers 1 to n");
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        inSeries(n);
    }
}








