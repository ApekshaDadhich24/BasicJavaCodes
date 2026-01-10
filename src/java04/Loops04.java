//menu driven program
package java04;
import java.util.*;
public class Loops04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter your choice (0 or 1) : ");
            int choice = sc.nextInt();
            if (choice==0){
                break;
            }
            else if (choice == 1){
                System.out.println("enter marks of the student : ");
                int marks = sc.nextInt();

                    if (marks>=90){
                        System.out.println("good result ");
            }
                    else if (marks>60 && marks<89){
                        System.out.println("this is good too");
            }
                    else if(marks>0 && marks<59){
                        System.out.println("this is also good because efforts matter more than marks");
            }
            }
        }
    }
}









