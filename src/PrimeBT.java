import java.util.Scanner;

public class PrimeBT {
    public static void main(String[] args) {
        boolean check = true;
        int num = 3;
        System.out.println("20 số nguyên tố đầu tiên là:");
        System.out.println(2);
        for ( int i = 2 ; i <= 20 ;  ) {
            for ( int j = 2 ; j < num ; j++ ) {
                if ( num % j == 0 ) {
                    check = false;
                    break;
                }
            }
            if ( check == true ) {
                System.out.println(num);
                i++;
        }
            check = true;
            num++;
        }




    }
}
