package baekjoon.solved.class1double;

import java.util.Scanner;

public class N10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = scanner.nextInt();
        String result = "";

        for (int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            if (x > a) {
                result += a + " ";
            }
        }

        System.out.println(result.trim());
    }
}
