import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Nhập a: ");
        a = input.nextInt();
        System.out.println("Nhập b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0){
            System.out.println("Không có mẫu số chung lớn nhất");
        }

        while (a != b ){
            if (a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }

        System.out.println("Mẫu số chung lớn nhất là : " + a);
    }
}
