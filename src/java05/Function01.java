// basic function code -- introduction to functions
package java05;
import java.util.Scanner;
public class Function01 {

    static void printName(String nameReceived){
        System.out.println("your name is : " + nameReceived); // actual print statement visible in output
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = sc.nextLine();
        printName(name);
    }
}
