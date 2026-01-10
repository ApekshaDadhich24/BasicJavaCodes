// Find area of circle, take radius as input from the user
package java01;
import java.util.*;
public class InputOutput04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius = sc.nextInt();
        System.out.print("Area of circle is: "+ 3.14*radius*radius);
        sc.close();
    }
}
