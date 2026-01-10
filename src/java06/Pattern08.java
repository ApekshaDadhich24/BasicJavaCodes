// to print Floyd triangle :
//1
//23
//456
//78910
package java06;
public class Pattern08 {
    public static void main(String[] args) {

        int n = 5;
        int k=0;
        for(int i = 0 ; i< n; i++){
            for ( int j = 0 ; j < n ; j++){

                if (i>=j){
                    k=k+1;
                    System.out.print(k+" ");
                    }
                }
            System.out.println();
            }
        }
    }


