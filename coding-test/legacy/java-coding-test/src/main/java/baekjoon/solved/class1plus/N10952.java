package baekjoon.solved.class1plus;

import java.util.Scanner;

public class N10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        while (true) {
//            int num1 = scanner.nextInt();
//            int num2 = scanner.nextInt();
//            if (num1 == 0 && num2 == 0) {
//                break;
//            }
//
//            System.out.println(num1 + num2);
//        }

        // 위 코드 개선

        while (true) {
            int sum = scanner.nextInt() + scanner.nextInt();
            if (sum == 0) {
                return;
            }
            System.out.println(sum);
        }
    }
}
