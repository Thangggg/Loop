import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        int choice ;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hình Tam Giác");
        System.out.println("2. Hình Vuông");
        System.out.println("3. Hình chữ nhật");
        System.out.println("0. Exit");
        System.out.println("Nhập vào số :");
        choice = input.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("Hình tam giác");
                System.out.println("#####");
                System.out.println("####");
                System.out.println("###");
                System.out.println("##");
                System.out.println("#");
                break;
            case 2 :
                System.out.println("Hình Vuông");
                System.out.println("# # # # #");
                System.out.println("#       #");
                System.out.println("#       #");
                System.out.println("#       #");
                System.out.println("# # # # #");
                break;
            case 3:
                System.out.println("Hình chữ nhật");
                System.out.println("# # # # # # #");
                System.out.println("#           #");
                System.out.println("# # # # # # #");
                break;
            case 0 :
                System.exit(0);
                break;
            default:
                System.out.println("Lựa chọn từ 1 đến 3");
        }
    }
}
