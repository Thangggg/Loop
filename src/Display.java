import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        int number, k = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hình Chữ Nhật");
        System.out.println("2. Hình Tam Giác Vuông dưới");
        System.out.println("3. Hình Tam Giác Vuông trên");
        System.out.println("4. Tam Giác Cân");
        System.out.println("Nhập vào số :");
        number = input.nextInt();
        
        switch (number) {
            case 1 :
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <= 7  ; j++) {
                        System.out.print("#");
                    }
                    System.out.println("");
                }

            case 2:
                for (int i = 1; i <=7  ; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("#");
                    }System.out.println();
                }

            case 3:
                for (int i = 7; i >=1 ; i--) {
                    for(int j = 1 ;j <= i; j++ ){
                        System.out.print("#");
                    }System.out.println();
                }
            case 4:
                for (int i = 1; i <= 7; i++, k = 0) {
                    for (int j = 1; j <= 7 - i; j++) {
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        k++;
                    }
                    System.out.println();
                }

        }
    }
}
