//printing hello 5 times using a function
package java05;
import java.util.*;
public class Function07 {


    static void printHello(){
      for(int i = 1 ; i <6 ; i ++ ){
          System.out.println("hello");
      }
      return;
    }

    public static void main(String[] args) {
        System.out.println("Printing hello world five times  : ");
        printHello();
    }
}
