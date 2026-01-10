//pattern -- only boundaries of the square

package java06;
public class Pattern02 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int i = 0 ; i < 4 ; i++ ){
            for ( int j = 0 ; j < 5 ; j++){
                if(i==0 || i==(n-1) || j==0 || j==(m-1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


