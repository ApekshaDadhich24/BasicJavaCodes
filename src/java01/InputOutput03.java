// Printing name by taking user input
package java01;
import java.util.*;
public class InputOutput03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.print("My name is: "+name);
        sc.close();
    }
}
