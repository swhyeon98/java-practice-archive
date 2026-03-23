package baekjoon.solved.class1plus;

import java.util.Scanner;

public class N2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int count = scanner.nextInt();
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < count; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
