// GCD through Euclidean algo (a,b == b,a%b)

package java07;
import java.util.Scanner;
public class BasicMaths05 {
    static int input(){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    static int GCD (int num1 , int num2) { //better approach to solve GCD
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.print("Enter num1 : ");
        int a = input();
        System.out.print("Enter num2 : ");
        int b = input();
        int answer =GCD(a,b);
        System.out.println(answer);
    }
}
