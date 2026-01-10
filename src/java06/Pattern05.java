//print the following pattern
//       *
//     * *
//   * * *
// * * * *


package java06;
public class Pattern05 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (i+j<=2) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

