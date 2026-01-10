// pattern to print a triange
//*
//**
//***
//****

package java06;
public class Pattern03 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0 ; i < n ; i++ ){
            for ( int j = 0 ; j < 4 ; j++){
                if(i>=j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
