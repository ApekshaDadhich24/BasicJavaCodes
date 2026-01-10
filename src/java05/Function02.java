//Print two names with one name as default parameter and other as input from the user
package java05;
import java.util.*;
public class Function02 {

    static void printTwoNames(String nameA, String nameB ){
        System.out.println("Name 1 is : "+ nameA);
        System.out.println("Name 2 is : "+ nameB);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name 1 : ");
        String name1 = sc.nextLine();
        System.out.println("Enter name 2 : ");
        String name2= sc.nextLine();
        printTwoNames("Apeksha",name2);
    }
}
