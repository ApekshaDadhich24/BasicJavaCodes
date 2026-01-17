//Given an integer n, write a function to print all numbers from n to 1
// (inclusive) using recursion.
//You must not use any loops such as for, while, or do-while.
//The function should print each number on a separate line, in decreasing order from n to 1


package java08;
import java.util.Scanner;
public class Recursion03 {
    static void printReverse(int num){
        if (num==0){
            return;
        }
        System.out.println(num);
        printReverse(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        printReverse(n);

    }
}
