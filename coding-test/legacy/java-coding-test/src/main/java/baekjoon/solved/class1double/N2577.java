package baekjoon.solved.class1double;

import java.util.Scanner;

public class N2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt() * scanner.nextInt() * scanner.nextInt();
        int[] count = new int[10];

//        String str = String.valueOf(number);
//
//        for (int i = 0; i < str.length(); i++) {
//            int index = str.charAt(i) - '0';
//            count[index]++;
//        }
        while (number != 0) {
            count[number % 10]++;
            number /= 10;
        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(count[i]);
//        }
        for (int num : count) {
            System.out.println(num);
        }

    }
}
