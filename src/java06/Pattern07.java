// to print the following pattern:
//12345
//1234
//123
//12
//1

package java06;
public class Pattern07 {
    public static void main(String[] args) {
        int n = 5;
        for ( int i = 0 ; i <= n ; i++){
            for ( int j = 0 ; j <= n ; j++){
               if (i+j<=4){
                   System.out.print(j+1);
               }else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
