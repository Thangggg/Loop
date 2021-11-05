import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
//        int count = 0;
//        int number = 2;
//        while (count < 20){
//            if (isPrime(number)){
//                System.out.println(number);
//                count++;
//            }number++;
//        }

        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }

        return check;
//        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        int num = 0;
//        String  primeNumbers = "";
//        System.out.println("Nhập vào số n:");
//        int n = scanner.nextInt();
//        scanner.close();
//        for (i = 1; i <= n; i++)
//        {
//            int counter = 0;
//            for(num = i; num >= 1; num--)
//            {
//                if(i % num==0)
//                {
//                    counter = counter + 1;
//                }
//            }
//            if (counter == 2)
//            {
//                primeNumbers = primeNumbers + i + " ";
//            }
//        }
//        System.out.println("Các số nguyên tố từ 1 đến "+ n +" là:");
//        System.out.println(primeNumbers);


    }
}
