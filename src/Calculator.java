

public class Calculator {
    public static void main(String[] args) {
        double money = 1.0, interestRate = 1.0;
        int month = 1;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Nhập số tiền gửi :" );
        money = input.nextDouble();
        System.out.println("Tháng gửi ");
        month = input.nextInt();
        System.out.println("Lãi xuất: ");
        interestRate = input.nextDouble();

        double sum = 0;
        for (int i = 0; i < month; i++) {
            sum = money * (interestRate / 100) / 12 * month;
        }

        System.out.println("Total interset: " + sum);
    }
}
