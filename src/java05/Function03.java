//Input also with the help of function
package java05;
import java.util.*;
public class Function03 {

    static String InputName(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
    static int InputAge(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }
    static void printNames(String name,int age ){ // name=names===a
        System.out.println("Name 1 is : "+ name);
        System.out.println("age is : "+age);
    }

    public static void main(String[] args) {
        System.out.println("Enter name : ");
        String names = InputName(); // gets value a from user hence names= a
        System.out.println("Enter age : ");
        int ages = InputAge();
        printNames(names,ages);

    }
}
