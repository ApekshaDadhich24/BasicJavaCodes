// to print reverse triangle pattern as follows
//****
//***
//**
//*

package java06;
public class Pattern04 {
    public static void main(String[] args) {
      int n = 4;
        for (int i = 0 ; i < n ; i++){
            for (int j = n ; j>i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
