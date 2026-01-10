// calculate area of a circle by taking radius as input using functions
package java05;
import java.util.*;
public class Function10 {

    static double areaCircle ( int A){
        double area = 3.14*A*A;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius : ");
        int radius = sc.nextInt();
        double value = areaCircle(radius);
        System.out.println("the area of the circle is : " + value);

    }
}
